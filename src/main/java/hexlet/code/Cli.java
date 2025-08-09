package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String getUserName() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}