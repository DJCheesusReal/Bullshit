import java.util.Scanner;

public class ceaser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a saying");
        String saying = input.nextLine();
        System.out.println("input shift");
        int shift = input.nextInt();
        shift = ((shift % 26) + 26) % 26;

        String finalString = "";
        for (char c : saying.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                finalString += (char) ('a' + (c - 'a' + shift) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                finalString += (char) ('A' + (c - 'A' + shift) % 26);
            } else {
                finalString += c;
            }
        }
        System.out.println(finalString);
    }
}