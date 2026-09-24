import java.util.Scanner;

public class password {

    public static void main(String[] args) throws Exception {
        Boolean verified = false;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("input your password");
            String password = input.nextLine();
            System.out.println("input your password again");
            String password2 = input.nextLine();
            if (password.equals(password2)) {
                System.out.println("passwords verified");
                verified = true;
            }

        } while (!verified);
    }

}
