import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean verified = false;
        do {
            System.out.println("input your password");
            String password = input.nextLine();
            System.out.println("input your password again");
            String password2 = input.nextLine();
            if (password.equals(password2)) {
                System.out.println("Password verified");
                verified = true;
            } else {
                System.out.println("Passwords do not match, please try again.");
            }
        } while (!verified);
    }
}