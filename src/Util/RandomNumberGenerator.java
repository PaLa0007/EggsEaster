package Util;

import java.util.Random;

public class RandomNumberGenerator {
    Random random = new Random();

    public RandomNumberGenerator() {
    }

    public int eggType() {
        return random.nextInt(3) + 1;
    }

    public int decorationType() {
        return random.nextInt(2) + 1;
    }
}
