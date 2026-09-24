import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first middle and last name: ");
        String name = input.nextLine().trim();

        String[] parts = name.split(" ");

        if (parts.length < 3) {
            System.out.println("Please enter first middle and last name.");
            return;
        }

        char first = parts[0].charAt(0);
        char middle = parts[1].charAt(0);
        char last = parts[2].charAt(0);

        System.out.println("Initials: " + first + "." + middle + "." + last + ".");

        input.close();
    }
}
