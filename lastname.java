import java.util.Scanner;

public class lastname {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input your full name");
        String name = input.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Input cannot be empty");
            return;
        }

        int split = -1;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                split = i;
            }
        }

        if (split == -1) {
            System.out.println("Hello " + name);
        } else {
            String last = name.substring(split + 1).trim();
            System.out.println("Hello " + last);
        }
    }
}