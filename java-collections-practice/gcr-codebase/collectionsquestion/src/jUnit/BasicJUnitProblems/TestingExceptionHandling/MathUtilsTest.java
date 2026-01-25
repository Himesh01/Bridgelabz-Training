package jUnit.BasicJUnitProblems.TestingExceptionHandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    MathUtils utils = new MathUtils();

    @Test
    void testDivideByZeroException() {

        ArithmeticException ex = assertThrows(
            ArithmeticException.class,
            () -> utils.divide(10, 0)
        );

        assertEquals("Cannot divide by zero", ex.getMessage());
    }

    @Test
    void testDivideSuccess() {
        assertEquals(5, utils.divide(10, 2));
    }
}