package homework.day4.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance() {
        Random random = new Random();
        int a = random.nextInt(99) + 1;
        System.out.println(a);

        String str = String.format("DistanceGenerator: I have generated distance with value: %d", a);
        System.out.println(str);
        return a;
    }
}
