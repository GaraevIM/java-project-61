package hexlet.code.games;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class Gcd {
    private static final String DESCRIPTION =
            "Find the greatest common divisor of given numbers.";

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = ThreadLocalRandom.current().nextInt(1, 101);
            int b = ThreadLocalRandom.current().nextInt(1, 101);
            String question = a + " " + b;
            String answer = String.valueOf(gcd(a, b));
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
