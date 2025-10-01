package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPS = {'+', '-', '*'};

    private static int eval(int a, int b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalArgumentException("Unsupported operation: " + op);
        };
    }

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            // ранее было RNG.nextInt(21) + 5 -> диапазон 5..25
            int a = Utils.generateNumber(5, 25);
            int b = Utils.generateNumber(5, 25);
            char op = OPS[Utils.generateNumber(0, OPS.length - 1)];

            String question = a + " " + op + " " + b;
            String answer = String.valueOf(eval(a, b, op));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}
