import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a saying");
        String saying = input.nextLine();
        int length = getlength(saying);
        String reversed = reverse(saying, length);
        System.out.println(reversed);
        if (saying.equals(reversed)) {
            System.out.println("PALINDROME DETECTED");
        }
    }

    public static String reverse(String saying, int length) {
        String reversesaying = "";
        for (int i = 0; i < length; i++) {
            reversesaying += saying.charAt(length - 1 - i);
        }
        return reversesaying;
    }

    public static int getlength(String saying) {
        return saying.length();
    }
}