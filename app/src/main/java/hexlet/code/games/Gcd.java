package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final SecureRandom RNG = new SecureRandom();

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            final int maxRandomNum = 100;
            final int shift = 1;
            int a = RNG.nextInt(maxRandomNum) + shift;
            int b = RNG.nextInt(maxRandomNum) + shift;
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
