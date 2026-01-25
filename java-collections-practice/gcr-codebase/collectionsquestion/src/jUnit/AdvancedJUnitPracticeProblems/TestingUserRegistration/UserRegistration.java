package jUnit.AdvancedJUnitPracticeProblems.TestingUserRegistration;

public class UserRegistration {
    public boolean registerUser(String username, String email, String password) {

        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty");
        }

        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Invalid email");
        }

        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters");
        }

        return true;
    }
}