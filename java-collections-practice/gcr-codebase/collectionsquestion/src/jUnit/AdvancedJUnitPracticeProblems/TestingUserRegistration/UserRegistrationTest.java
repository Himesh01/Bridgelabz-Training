package jUnit.AdvancedJUnitPracticeProblems.TestingUserRegistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration user = new UserRegistration();

    @Test
    public void testValidUserRegistration() {
        assertTrue(user.registerUser("Ayush", "ayush@gmail.com", "secret123"));
    }

    @Test
    public void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            user.registerUser("", "ayush@gmail.com", "secret123");
        });
    }

    @Test
    public void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            user.registerUser("Ayush", "ayushgmail.com", "secret123");
        });
    }

    @Test
    public void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            user.registerUser("Ayush", "ayush@gmail.com", "123");
        });
    }
}