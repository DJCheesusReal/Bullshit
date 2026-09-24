import java.util.Scanner;

public class isbn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cleanIsbn = "";

        while (true) {
            System.out.println("input a 13 digit isbn");
            String raw = input.nextLine();
            cleanIsbn = raw.replace("-", "").trim();
            if (cleanIsbn.length() == 13) {
                break;
            }
            System.out.println("Invalid length. Please re-enter.");
        }

        int sum = 0;
        for (int i = 0; i < 12; i++) {
            int digit = Character.getNumericValue(cleanIsbn.charAt(i));
            if (i % 2 == 0) {
                sum += digit * 1;
            } else {
                sum += digit * 3;
            }
        }

        int checkDigit = Character.getNumericValue(cleanIsbn.charAt(12));
        int remainder = sum % 10;
        int calculatedCheck = (10 - remainder) % 10;

        if (calculatedCheck == checkDigit) {
            System.out.println("ISBN is valid");
        } else {
            System.out.println("ISBN is not valid");
        }
    }
}