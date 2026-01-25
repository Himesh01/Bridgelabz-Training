package jUnit.BasicJUnitProblems.TestingParameterizedTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {

    NumberUtils utils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {

        boolean result = utils.isEven(number);

        if (number % 2 == 0)
            assertTrue(result);
        else
            assertFalse(result);
    }
}