package jUnit.AdvancedJUnitPracticeProblems.TestingDateFormatter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        assertEquals("15-08-2024", formatter.formatDate("2024-08-15"));
        assertEquals("01-01-2023", formatter.formatDate("2023-01-01"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("15/08/2024");
        });
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2024-13-40");
        });
    }

    @Test
    void testNullDate() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
    }
}