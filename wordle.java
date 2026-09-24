import java.util.Scanner;

public class wordle {
    public static void main(String[] args) {
        boolean correct = false;
        String word = "RANDOM";
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("input your guess");
            String guess = input.nextLine().toUpperCase();
            if (guess.length() != word.length()) {
                System.out.println("your guess must be exactly " + word.length() + " letters long");
                continue;
            }

            if (guess.equals(word)) {
                System.out.println("you guessed it!");
                System.out.println(word);
                correct = true;
            } else {
                String guessed = "";
                for (int i = 0; i < guess.length(); i++) {
                    if (guess.charAt(i) == word.charAt(i)) {
                        guessed += word.charAt(i);
                    } else {
                        guessed += "?";
                    }
                }
                System.out.println(guessed);
            }
        } while (!correct);
    }
}