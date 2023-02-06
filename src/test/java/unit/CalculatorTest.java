package unit;

import org.example.examples.Calculator;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    double delta = 0.0001; //This allows for small differences between the expected and actual values that may be due to rounding errors or other small inaccuracies

    @Test
    public void testAdd() {
        double expected = 8.2;
        double actual = Calculator.add(5.0, 3.2);
         assertEquals(expected, actual, delta);
    }

    @Test
    public void testMultiplication() {
        double expected = 16.0;
        double actual = Calculator.multiply(4.0, 4.0);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testDivide() {
        double expected = 2.0;
        double actual = Calculator.divide(4.0, 2.0);
        assertEquals(expected, actual, delta);
    }

    @Test
    public void testDivideByZero() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(4.0, 0.0));
        assertEquals("Cannot divide by zero!", exception.getMessage());
    }

    @Disabled
    @Test
    public void testDivideByZero1() {
        try {
            Calculator.divide(4.0, 0.0);
            fail("Cannot divide by zero!");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero!", e.getMessage());
        }
    }

    @Test
    public void testSubtract() {
        double result = Calculator.subtract(4.0, 2.0);
        assertEquals(2.0, result, 0.0);
    }

    /***
     * assertions using hamcrest
     */
    @Test
    public void testMultiplication2() {
        double result = Calculator.multiply(3, 4);
        assertThat(result, is(equalTo(12.0)));
    }
    @Test
    public void testMultiplication3() {
        double result = Calculator.multiply(3.14, 4.56);
        assertThat(result, is(closeTo(14.3184, delta)));
    }

    /***
     * example of parameterized test
     */

    @ParameterizedTest
    @CsvSource({
            "3.14, 4.56, 7.7",
            "1.23, 4.56, 5.79",
            "0.0, 0.0, 0.0"
    })
    public void testAddition(double x, double y, double expected) {
        double result = Calculator.add(x, y);
        assertThat(result, is(closeTo(expected, delta)));
    }
}
