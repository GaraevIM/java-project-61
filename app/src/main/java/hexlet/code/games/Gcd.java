package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final String DESCRIPTION =
            "Find the greatest common divisor of given numbers.";

    private static final int MIN = 1;
    private static final int MAX = 100;

    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int x = Utils.generateNumber(MIN, MAX);
            int y = Utils.generateNumber(MIN, MAX);

            String question = x + " " + y;
            String answer = String.valueOf(gcd(x, y));

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}
