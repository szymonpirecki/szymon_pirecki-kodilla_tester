package poczatki;

public class Loop {
    public static void main(String[] args) {
        String[] namesForPuppy = new String[5];

        namesForPuppy[0] = "Renatka";
        namesForPuppy[1] = "Hyzio";
        namesForPuppy[2] = "Dyzio";
        namesForPuppy[3] = "Zyzio";
        namesForPuppy[4] = "Gruby";

        int numberOfElements = namesForPuppy.length;

        for (int i = numberOfElements - 1; i >= 0; i--) {
            System.out.println(namesForPuppy[i]);
        }

        int[] numbers = new int[] {1, 2, 3, 4, 55,};
        int result = sumNumbers(numbers);
        System.out.println(result);
     }

    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];
            }
        return result;
    }
    }



























