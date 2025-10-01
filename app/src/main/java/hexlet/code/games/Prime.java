package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String DESCRIPTION =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static final int MAX = 100;
    private static final int FIRST_ODD_DIVISOR = 3;

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            return n == 2;
        }
        for (int d = FIRST_ODD_DIVISOR; d * d <= n; d += 2) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int number = Utils.generateNumber(1, MAX);

            String question = String.valueOf(number);
            String answer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}
