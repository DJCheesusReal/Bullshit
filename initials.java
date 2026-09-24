import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first middle and last name: ");
        String name = input.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Input cannot be empty");
            return;
        }

        String initials = "";
        boolean newWord = true;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c != ' ') {
                if (newWord) {
                    initials += Character.toUpperCase(c) + ".";
                    newWord = false;
                }
            } else {
                newWord = true;
            }
        }

        System.out.println("Initials: " + initials);
    }
}