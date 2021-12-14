package zadaniePetle;

import java.util.Random;

public class RandomNumbers {
    private int min = 30;
    private int max = 0;

    public void getCountOfRandomNumber() {
        Random random = new Random();
        int sum = 0;
        int temp;
        int counter = 0;
        int maximum = 5000;
        while (sum < maximum) {
            temp = random.nextInt(30);
            sum = sum + temp;
            counter++;
            if(temp < min){
                min = temp;
            }
            if(temp > max){
                max = temp;
            }
        }
        System.out.println("the number of draws: " + counter);
        System.out.println("the sum of drawn number: " + sum);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }


    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getCountOfRandomNumber();
        System.out.println("the highest drawn number: " + randomNumbers.getMax());
        System.out.println("the lowest drawn number: " + randomNumbers.getMin());
    }
}
