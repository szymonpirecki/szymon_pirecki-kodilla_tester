package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        double subtractResult = calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        double squareResult = calculator.square(a);
        boolean correctSquare = ResultChecker.assertEquals(25, squareResult);

        if(correctSum){
            System.out.println("Metoda sum działa poprawnie dla liczb: " + a + " i " + b);
        }
        else{
            System.out.println("Metoda sum nie działa poprawnie dla liczb: " + a + " i " + b);

        }
        if(correctSubtract){
            System.out.println("Metoda subtract działa poprawnie dla liczb: " + a + " i " + b);
        }
        else{
            System.out.println("Metoda subtract nie działa poprawnie dla liczb: " + a + " i " + b);
        }
        if(correctSquare){
            System.out.println("Metoda square działa poprawnie dla liczby: " + a);
        }
        else{
            System.out.println("Metoda square nie działa poprawnie dla liczby: " + a);
        }
    }
}
