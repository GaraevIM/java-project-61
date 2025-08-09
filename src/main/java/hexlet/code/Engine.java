package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void run(String gameDescription, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        String name = Cli.getUserName(); // верни имя из Cli
        System.out.println("Hello, " + name + "!");
        System.out.println(gameDescription);

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String question = roundsData[i][0];
            String correctAnswer = roundsData[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}