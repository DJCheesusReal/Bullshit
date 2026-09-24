import java.util.Scanner;

public class string_handling_tasks {

    public static void main(String[] args) throws Exception {
        int vowels = 0;
        int consonant = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("input a saying");
        String saying = input.nextLine();
        int length = saying.length();
        System.out.print(length);
        System.out.println(length);
        for (int i = 0; i < length; i++)
            System.out.print(saying.charAt(length - 1 - i));
            System.out.println(" ");
        for (char c : saying.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels = vowels + 1;
            } else {
                consonant = consonant + 1;
            }


        }
        System.out.println("Your string has " + vowels + " vowels and " + consonant + " consonants");

    }
}
