package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPS = {'+', '-', '*'};
    private static final SecureRandom RNG = new SecureRandom();

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            final int maxRandomNum = 21;
            final int shift = 5;
            int a = RNG.nextInt(maxRandomNum) + shift;
            int b = RNG.nextInt(maxRandomNum) + shift;
            char op = OPS[RNG.nextInt(OPS.length)];

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
