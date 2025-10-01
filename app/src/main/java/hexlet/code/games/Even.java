package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String DESCRIPTION =
            "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static final int MIN = 1;
    private static final int MAX = 100;

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int n = Utils.generateNumber(MIN, MAX);

            String question = String.valueOf(n);
            String answer = isEven(n) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(DESCRIPTION, rounds);
    }
}
