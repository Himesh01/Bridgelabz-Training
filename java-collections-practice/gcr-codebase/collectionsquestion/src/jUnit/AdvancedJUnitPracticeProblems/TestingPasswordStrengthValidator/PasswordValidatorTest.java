package jUnit.AdvancedJUnitPracticeProblems.TestingPasswordStrengthValidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Strong1A"));
    }

    @Test
    void testNoUpperCase() {
        assertFalse(validator.isValid("strong123"));
    }

    @Test
    void testNoDigit() {
        assertFalse(validator.isValid("StrongPass"));
    }

    @Test
    void testTooShort() {
        assertFalse(validator.isValid("A1a"));
    }
}