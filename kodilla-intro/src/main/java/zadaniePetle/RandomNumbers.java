package zadaniePetle;

import java.util.Random;

public class RandomNumbers {
    public void getCountOfRandomNumber() {
        Random random = new Random();
        int sum = 0;
        int temp;
        int counter = 0;
        int max = 5000;
        while (sum < max) {
            temp = random.nextInt(30);
            sum = sum + temp;
            counter++;
        }
        System.out.println("the number of draws: " + counter);
        System.out.println("the sum of drawn number: " + sum);
    }

//    public int lowestDraw(){
//
//    }








//        for(int i = 0; i <= counter; i++){
//            if (temp < i){
//                System.out.println("the lowest drawn number: " + temp);
//            }
//        }
//        for(int i = counter; i >= counter; i--) {
//            if (temp > i) {
//                System.out.println("the highest drawn number: " + temp);
//            }
//        }

//        System.out.println(Math.max(temp));
//        System.out.println(Math.min(temp, temp));


    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.getCountOfRandomNumber();
    }
}
