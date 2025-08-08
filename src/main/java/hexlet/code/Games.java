package hexlet.code;
import java.util.Scanner;

public class Games {
    public static int choiceGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String s = scanner.nextLine();
        return Integer.parseInt(s);
    }
}
