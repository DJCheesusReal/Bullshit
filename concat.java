import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input your first name");
        String name = input.nextLine();
        System.out.println("input your last name");
        String last = input.nextLine();
        String fullname = name + " " + last;
        System.out.println("Hello " + fullname);
        System.out.println(fullname.length());
    }
}