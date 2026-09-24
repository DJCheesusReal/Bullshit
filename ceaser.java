    import java.util.Scanner;

    public class ceaser {

        public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
            System.out.println("input a saying");
            String saying = input.nextLine();
            System.out.println("input shift");
            int shift = input.nextInt();
            String finalString = "";
            for (char c : saying.toLowerCase().toCharArray()) {
               int ascii = (int) c;
               ascii = ascii + shift;
               if (ascii > 122){
                   ascii = ascii - 26;
               }
               finalString = finalString + (char) ascii;
            }
            System.out.println(finalString);


        }

    }
