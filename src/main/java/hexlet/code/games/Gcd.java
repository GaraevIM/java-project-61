package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final String DESCRIPTION =
            "Find the greatest common divisor of given numbers.";

    public static void play() {
        String[][] rounds = new String[Engine.ROUNDS_COUNT][2];
        Random rnd = new Random();

        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int a = rnd.nextInt(1, 101); // 1..100
            int b = rnd.nextInt(1, 101);

            rounds[i][0] = a + " " + b;
            rounds[i][1] = String.valueOf(gcd(a, b));
        }

        Engine.run(DESCRIPTION, rounds);
    }

    private static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
