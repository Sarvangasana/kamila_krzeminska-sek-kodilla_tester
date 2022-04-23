import java.util.Random;

public class RandomNumbers {
    private static final Random random = new Random();
    private int min = Integer.MAX_VALUE;
    private int max = Integer.MIN_VALUE;

    public void shuffleAndSumRandomNumbers() {
        int sum = 0;
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        while (sum <= 5000) {
            int a = random.nextInt(30) + 1;
            if (a > max) {
                max = a;
            }
            if (a < min) {
                min = a;
            }
            sum += a;
        }
        System.out.println(sum);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
