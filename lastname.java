import java.util.Scanner;

public class lastname {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input your full name");
        String name = input.nextLine().trim();

        int split = -1;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ' && i != 0) {
                split = i;
            }
        }

        if (split == -1) {
            System.out.println("Hello " + name);
            return;
        }
        
        String first = name.substring(0, split);
        String last = name.substring(split + 1);
        System.out.println("Hello " + first + " " + last);
        System.out.println("Your last name is " + last);
        input.close();
    }
}
