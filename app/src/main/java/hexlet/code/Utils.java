package hexlet.code;

import java.security.SecureRandom;

public final class Utils {
    private static final SecureRandom RNG = new SecureRandom();

    private Utils() { }

    public static int generateNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min > max: " + min + " > " + max);
        }
        return RNG.nextInt((max - min) + 1) + min;
    }
}
