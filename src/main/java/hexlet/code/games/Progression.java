package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final String DESCRIPTION =
            "What number is missing in the progression?";

    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        Random rnd = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int length = rnd.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
            int start = rnd.nextInt(1, 21);
            int step = rnd.nextInt(1, 11);
            int hiddenIndex = rnd.nextInt(length);

            int[] progression = generateProgression(start, step, length);
            int hiddenValue = progression[hiddenIndex];
            progression[hiddenIndex] = Integer.MIN_VALUE;

            StringBuilder question = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if (progression[j] == Integer.MIN_VALUE) {
                    question.append("..");
                } else {
                    question.append(progression[j]);
                }
                if (j < length - 1) {
                    question.append(" ");
                }
            }

            rounds[i][0] = question.toString();
            rounds[i][1] = String.valueOf(hiddenValue);
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static int[] generateProgression(int start, int step, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = start + i * step;
        }
        return progression;
    }
}
