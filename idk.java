import java.util.Random;

class idk {
    public static void main(String[] args) {
        int size = 25;
        String[][] maze = new String[size][size];
        Random random = new Random();
        int rowStart = random.nextInt(size);
        int columnStart = random.nextInt(size);
        maze[rowStart][columnStart] = "S";
        int rowEnd = random.nextInt(size);
        int columnEnd = random.nextInt(size);

        while (rowEnd == rowStart && columnEnd == columnStart) {
            rowEnd = random.nextInt(size);
            columnEnd = random.nextInt(size);
        }
        maze[rowEnd][columnEnd] = "E";

        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                if (maze[row][column] == null) {
                    maze[row][column] = "#";
                }
            }
        }

        boolean[][] visited = new boolean[size][size];
        boolean solved = solveMaze(
                maze, visited, rowStart, columnStart,
                rowEnd, columnEnd, random
        );
        drawMaze(maze);
        System.out.println(solved ? "Reached the end!" : "No path found.");
    }

    static boolean solveMaze(
            String[][] maze,
            boolean[][] visited,
            int row,
            int column,
            int endRow,
            int endColumn,
            Random random) {
        if (row < 0 || row >= maze.length ||
            column < 0 || column >= maze[0].length ||
            visited[row][column]) {
            return false;
        }

        visited[row][column] = true;
        if (!maze[row][column].equals("S") &&
            !maze[row][column].equals("E")) {
            maze[row][column] = ".";
        }
        drawMaze(maze);
        pause();

        if (row == endRow && column == endColumn) {
            return true;
        }

        int[] directions = {0, 1, 2, 3};
        shuffle(directions, random);
        for (int direction : directions) {
            int[] next = goNext(row, column, direction);
            if (solveMaze(
                    maze, visited, next[0], next[1],
                    endRow, endColumn, random
            )) {
                if (!maze[row][column].equals("S")) {
                    maze[row][column] = "*";
                }
                return true;
            }
        }

        if (!maze[row][column].equals("S") &&
            !maze[row][column].equals("E")) {
            maze[row][column] = "#";
        }
        drawMaze(maze);
        pause();
        return false;
    }

    static int[] goNext(int row, int column, int direction) {
        if (direction == 0) {
            row--;
        } else if (direction == 1) {
            row++;
        } else if (direction == 2) {
            column--;
        } else if (direction == 3) {
            column++;
        }
        return new int[]{row, column};
    }

    static void shuffle(int[] directions, Random random) {
        for (int i = directions.length - 1; i > 0; i--) {
            int swapIndex = random.nextInt(i + 1);
            int temporary = directions[i];
            directions[i] = directions[swapIndex];
            directions[swapIndex] = temporary;
        }
    }

    static void drawMaze(String[][] maze) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        for (String[] row : maze) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    static void pause() {
        try {
            Thread.sleep(35);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }
}
