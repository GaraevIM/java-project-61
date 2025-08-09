package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
    private static final String DESCRIPTION =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        Random rnd = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int n = rnd.nextInt(2, 101);
            rounds[i][0] = String.valueOf(n);
            rounds[i][1] = isPrime(n) ? "yes" : "no";
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            return n == 2;
        }
        int limit = (int) Math.sqrt(n);
        for (int d = 3; d <= limit; d += 2) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }
}
