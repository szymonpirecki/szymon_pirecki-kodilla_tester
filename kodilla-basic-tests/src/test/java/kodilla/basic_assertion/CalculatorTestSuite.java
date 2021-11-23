package java.kodilla.basic_assertion;

import com.kodilla.basic_assertion.Calculator;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);

    }
}
