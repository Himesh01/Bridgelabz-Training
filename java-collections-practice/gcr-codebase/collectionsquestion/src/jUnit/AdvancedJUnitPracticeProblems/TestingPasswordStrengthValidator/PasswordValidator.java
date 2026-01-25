package jUnit.AdvancedJUnitPracticeProblems.TestingPasswordStrengthValidator;

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password == null || password.length() < 8)
            return false;

        boolean hasUpper = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            if (Character.isDigit(ch)) hasDigit = true;
        }

        return hasUpper && hasDigit;
    }
}