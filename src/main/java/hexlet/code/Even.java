package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int correctInRow = 0;
        while (correctInRow < 3) {
            int randomNum = rand.nextInt(100);  // генерим в цикле
            System.out.println("Question: " + randomNum);
            System.out.print("Your answer: ");
            String ans = scanner.nextLine().trim().toLowerCase();
            String expected = (randomNum % 2 == 0) ? "yes" : "no";
            if (ans.equals(expected)) {
                System.out.println("Correct!");
                correctInRow++;
            } else {
                System.out.println("'" + ans + "' is wrong answer ;(. Correct answer was '" + expected + "'.");
                System.out.println("Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
