import java.util.Scanner;

public class test {
    public static final String	BLACK				= "\u001B[30m";
    public static final String	RED					= "\u001B[31m";
    public static final String	GREEN				= "\u001B[32m";
    public static final String	YELLOW				= "\u001B[33m";
    public static final String	BLUE				= "\u001B[34m";
    public static final String	MAGENTA				= "\u001B[35m";
    public static final String	CYAN				= "\u001B[36m";
    public static final String	WHITE				= "\u001B[37m";
    public static final String	ITALIC				= "\u001B[3m";
    public static final String	BACKGROUND_GREEN	= "\u001B[42m";
    public static final String	BACKGROUND_BLACK	= "\u001B[40m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("input text: ");
        String textr = input.nextLine();
        System.out.println(RED + textr + ANSI_RESET);
        System.out.println(BLACK + ITALIC + BACKGROUND_GREEN + textr + ANSI_RESET);
        System.out.println(GREEN + ITALIC + BACKGROUND_BLACK + textr + ANSI_RESET);



    }
}
