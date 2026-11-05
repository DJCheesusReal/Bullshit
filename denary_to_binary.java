import java.util.Scanner;

public class denary_to_binary {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Choose a conversion:");
		System.out.println("1. Binary to denary");
		System.out.println("2. Denary to binary");
		System.out.println("3. Denary to hexadecimal");
		System.out.print("Enter your choice: ");

		int choice = scanner.nextInt();

		switch (choice) {
			case 1:
				System.out.print("Enter a binary number: ");
				String binary = scanner.next();
				try {
					int denary = Integer.parseInt(binary, 2);
					System.out.println("The denary representation is " + denary);
				} catch (NumberFormatException exception) {
					System.out.println("That is not a valid binary number.");
				}
				break;
			case 2:
				System.out.print("Enter a denary number: ");
				int denary = scanner.nextInt();
				System.out.println("The binary representation is " + Integer.toBinaryString(denary));
				break;
			case 3:
				System.out.print("Enter a denary number: ");
				int number = scanner.nextInt();
				System.out.println("The hexadecimal representation is " + Integer.toHexString(number).toUpperCase());
				break;
			default:
				System.out.println("Invalid choice.");
		}
	}
}
