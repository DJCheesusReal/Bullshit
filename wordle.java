import java.util.Scanner;

public class wordle {

    public static void main(String[] args) throws Exception {
        boolean correct = false;
        String word = "RANDOM";
        int length = 0;
        String guessed = "";
        for (int i = 0; i < word.length(); i++){
            guessed = guessed + "?";
        }
        System.out.println(guessed);
        Scanner input = new Scanner(System.in);
        do {
            guessed = "";
            System.out.println("input your guess");
            String guess = input.nextLine().toUpperCase();
            if (guess.length() != word.length()) {
                System.out.println("your guess must be exactly " + word.length() + " letters long");
                continue;
            }
            length = guess.length();

            if (guess.equals(word)) {
                System.out.println("you guessed it!");
                correct = true;
            } else {
                for (int i = 0; i < guess.length(); i++) {
                    if (guess.charAt(i) == word.charAt(i)) {
                        guessed = guessed + word.charAt(i);
                    } else {
                        guessed = guessed + "?";
                    }

                }
            }
            System.out.println(guessed);

        } while (!correct);
    }
}
