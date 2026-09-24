import java.util.Scanner;

public class lastname {

    public static void main(String[] args) throws Exception {
        int split = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("input your full name");
        String name = input.nextLine();
        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i).equals(" ")) && i != 0){
                split = i;
            }

        }
        String first = name.substring(0,split);
        String last = name.substring(split);
        System.out.println("Hello " + first + last);

    }

}
