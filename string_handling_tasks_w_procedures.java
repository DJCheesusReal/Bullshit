import java.util.Scanner;

public class string_handling_tasks_w_procedures {

    public static void main(String[] args) throws Exception {
        int vowels = 0;
        int consonant = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("input a saying");
        String saying = input.nextLine();
        int length = getlength(saying);
        System.out.println("length is: " + length);
        System.out.println("reverse is: " + reverse(saying, length));
        System.out.println("Your string has " + getVowels(saying) + " vowels and " + getconsonants(saying) + " consonants");

    }

    public static int getlength (String saying){
        int length = 0;
        length = saying.length();
        return length;
    }

    public static String reverse (String saying, int length){
        String reversesaying = "";
        for (int i = 0; i < length; i++) {
            reversesaying = reversesaying + saying.charAt(length - 1 - i);
        };
        return reversesaying;
    }

    public static int getVowels (String saying){
        int vowels = 0;
        for (char c : saying.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels = vowels + 1;
            }
        }
        return vowels;

    }

    public static int getconsonants (String saying){
        int consonants = 0;
        for (char c : saying.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

            } else {
                consonants = consonants + 1;
            }
        }
        return consonants;

    }
}
