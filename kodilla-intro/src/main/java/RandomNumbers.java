import java.util.Random;

import java.util.Random;

public class RandomNumbers {
    private int sum;
    private int min;
    private int max;
    private Random random;

    public RandomNumbers() {
        sum = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        random = new Random();
    }

    public void generateRandomNumbers() {
        while (sum <= 5000) {
            int number = random.nextInt(31);
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
