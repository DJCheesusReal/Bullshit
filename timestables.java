import java.util.Scanner;

public class timestables {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("input number to view timestables: ");
        int number = input.nextInt();
        if (number < 1);
        System.out.println("numbers less than 1!!!");
        System.exit(0);
        for (int i = 1; i < 13; i++) {
            System.out.println(number + "X" + i + "=" + (number * i));
        }


    }
}
