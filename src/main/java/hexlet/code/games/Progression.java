package hexlet.code.games;

import hexlet.code.Engine;
import java.util.concurrent.ThreadLocalRandom;

public class Progression {
    private static final String DESCRIPTION =
            "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int length = ThreadLocalRandom.current().nextInt(MIN_LENGTH, MAX_LENGTH + 1);
            int start  = ThreadLocalRandom.current().nextInt(1, 21);
            int step   = ThreadLocalRandom.current().nextInt(1, 11);
            int hiddenIndex = ThreadLocalRandom.current().nextInt(length);

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
