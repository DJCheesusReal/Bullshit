import java.util.Scanner;

public class wordcount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a saying");
        String saying = input.nextLine().trim();

        if (saying.isEmpty()) {
            System.out.println("Word count: 0");
            return;
        }

        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < saying.length(); i++) {
            if (saying.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println("Number of words: " + count);
    }
}