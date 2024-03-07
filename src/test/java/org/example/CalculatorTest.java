package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void add() {
        double num1 = 10;
        double num2 = 20;
        double expectedResult = 30;

        double result = Calculator.add(num1, num2);

        assertEquals(expectedResult, result, 0.0001);
    }
}
