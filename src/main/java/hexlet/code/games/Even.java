package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        Random rnd = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int n = rnd.nextInt(100);
            String question = String.valueOf(n);
            String answer = (n % 2 == 0) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}
