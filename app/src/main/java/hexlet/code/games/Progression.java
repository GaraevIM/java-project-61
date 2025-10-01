package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final String DESCRIPTION =
            "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;

    private static String[] makeProgression(int first, int step, int length) {
        String[] arr = new String[length];
        int cur = first;
        for (int i = 0; i < length; i++) {
            arr[i] = String.valueOf(cur);
            cur += step;
        }
        return arr;
    }

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int first = Utils.generateNumber(1, 20);
            int step = Utils.generateNumber(1, 10);
            int hiddenIndex = Utils.generateNumber(0, PROGRESSION_LENGTH - 1);

            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);

            String answer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        Engine.run(DESCRIPTION, rounds);
    }
}
