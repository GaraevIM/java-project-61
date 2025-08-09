package hexlet.code.games;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class Calc {
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final char[] OPS = {'+', '-', '*'};

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = ThreadLocalRandom.current().nextInt(5, 26);
            int b = ThreadLocalRandom.current().nextInt(5, 26);
            char op = OPS[ThreadLocalRandom.current().nextInt(OPS.length)];

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
