package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String name;

    public static void getUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I have your name? ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
