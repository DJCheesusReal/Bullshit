import java.util.Objects;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("input a saying");
        String saying = input.nextLine();
        int length = getlength(saying);
        System.out.println(reverse(saying, length));
        if (Objects.equals(reverse(saying, length), saying)){
            System.out.println(reverse(saying, length));
            System.out.println("PALINDROME DETECTED");
        }


    }
    public static String reverse (String saying, int length){
        String reversesaying = "";
        for (int i = 0; i < length; i++) {
            reversesaying = reversesaying + saying.charAt(length - 1 - i);
        };
        return reversesaying;
    }
    public static int getlength (String saying){
        int length = 0;
        length = saying.length();
        return length;
    }

}
