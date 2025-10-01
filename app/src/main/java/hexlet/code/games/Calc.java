package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPS = {'+', '-', '*'};
    private static final int MIN = 5;
    private static final int MAX = 25;

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
            int a = Utils.generateNumber(MIN, MAX);
            int b = Utils.generateNumber(MIN, MAX);
            char op = OPS[Utils.generateNumber(0, OPS.length - 1)];

            String question = a + " " + op + " " + b;
            String answer = String.valueOf(eval(a, b, op));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}
