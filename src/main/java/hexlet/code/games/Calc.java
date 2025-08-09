package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPS = {'+', '-', '*'};

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        Random rnd = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = rnd.nextInt(21) + 5;
            int b = rnd.nextInt(21) + 5;
            char op = OPS[rnd.nextInt(OPS.length)];

            int result;
            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                default:
                    result = a * b;
                    break;
            }

            String question = a + " " + op + " " + b;
            String answer = String.valueOf(result);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}
