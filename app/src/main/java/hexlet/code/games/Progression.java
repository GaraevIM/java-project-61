package hexlet.code.games;

import hexlet.code.Engine;
import java.security.SecureRandom;

public class Progression {
    private static final String DESCRIPTION =
            "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        SecureRandom rng = new SecureRandom();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int length = rng.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = rng.nextInt(20) + 1;
            int step = rng.nextInt(10) + 1;
            int hiddenIndex = rng.nextInt(length);

            int[] prog = generateProgression(start, step, length);
            int hiddenValue = prog[hiddenIndex];

            StringBuilder q = new StringBuilder();
            for (int j = 0; j < length; j++) {
                q.append(j == hiddenIndex ? ".." : prog[j]);
                if (j < length - 1) {
                    q.append(' ');
                }
            }

            rounds[i][0] = q.toString();
            rounds[i][1] = String.valueOf(hiddenValue);
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = start + i * step;
        }
        return arr;
    }
}
