public class RandomNumbers {
    private int max;
    private int sum;

    public int randomNumbersMetoda(int max){
        this.max = max;
        RandomNumbers randomNumbersObiekt = new RandomNumbers();
        int result = 0;
        int sum = 0;
        max = 500;
        while (sum < max){
            int temp = randomNumbersObiekt.nextInt(30); //nie dziala mi metoda nextInt, przepisalem to z preworka; zrobilem cos zle? czy musze metode do losowania liczb pobrac lub napisac sam?
            sum = sum + temp;
            result++;
        }
        return result;



        }
}
