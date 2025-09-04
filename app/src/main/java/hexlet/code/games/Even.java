package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final SecureRandom RNG = new SecureRandom();

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            final int maxRandomNum = 100;
            final int shift = 1;
            int n = RNG.nextInt(maxRandomNum) + shift;
            String question = String.valueOf(n);
            String answer = (n % 2 == 0) ? "yes" : "no";
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.run(DESCRIPTION, rounds);
    }
}
