package zadaniePetle;

import java.util.Random;

public class RandomNumbers {
    public int getCountOfRandomNumber(int max) {
        Random random = new Random();
        int result = 0;
        int sum = 0;
        max = 5000;
        while (sum < max) {
            int temp = random.nextInt(30);
            sum = sum + temp;
            result++;
        }
        return result;
    }
}
