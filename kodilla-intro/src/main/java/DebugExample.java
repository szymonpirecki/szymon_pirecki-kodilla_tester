public class DebugExample {
    public static void main(String[] args){
        int firstNumber = 1;
        int secondNumber = 1;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            substractAndDisplay(firstNumber, secondNumber);
        }
        else {
            sumAndDisplay(firstNumber, secondNumber);
        }
    }
    private static void sumAndDisplay(int a, int b){
        int result = a + b;

        System.out.println(result);
    }
    private static void substractAndDisplay(int a, int b){
        int result = a - b;

        System.out.println(result);
        }

}
