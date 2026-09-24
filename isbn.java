import java.util.Scanner;

public class isbn {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("input an isbn");
        String isbn = input.nextLine();
        isbn = isbn.replace("-", "");
        int num = 0;
        int isbn2 = 0;
        for (int i = 0; i < 12; i++){
            if (i % 2 != 0){
                num = (int) Character.getNumericValue(isbn.charAt(i));
                System.out.println(num);
            } else {
                num = (int) Character.getNumericValue(isbn.charAt(i)) * 3;
                System.out.println(num);
            };
            isbn2 = isbn2 + num;
            System.out.println(isbn2);
        }


        int checkDigit = Character.getNumericValue(isbn.charAt(12));
        int remainder = isbn2 % 10;
        int calculatedCheck = (10 - remainder) % 10;
        if (calculatedCheck == checkDigit) {
            System.out.println("valid isbn");
        } else {
            System.out.println("invalid isbn");
        }
    }
}
