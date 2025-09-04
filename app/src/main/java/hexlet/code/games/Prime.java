package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final SecureRandom RNG = new SecureRandom();

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            final int maxRandomNum = 100;
            final int shift = 2;
            int n = RNG.nextInt(maxRandomNum) + shift;
            rounds[i][0] = String.valueOf(n);
            rounds[i][1] = isPrime(n) ? "yes" : "no";
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
