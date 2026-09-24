import java.util.Scanner;

public class string_handling_tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a saying");
        String saying = input.nextLine();

        if (saying.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        int length = saying.length();
        System.out.println("Length: " + length);

        System.out.print("Reversed: ");
        for (int i = 0; i < length; i++) {
            System.out.print(saying.charAt(length - 1 - i));
        }
        System.out.println();

        int vowels = 0;
        int consonants = 0;
        for (char c : saying.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Your string has " + vowels + " vowels and " + consonants + " consonants");
    }
}