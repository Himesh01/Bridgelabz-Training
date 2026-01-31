package functionalInterface.staticmethodsinInterface.passwordValidator;

public interface SecurityUtils {
	
	public static boolean isStrongPassword(String password) {

        if (password == null) return false;

        boolean hasUppercase = password.chars()
                                       .anyMatch(Character::isUpperCase);

        boolean hasDigit = password.chars()
                                   .anyMatch(Character::isDigit);

        boolean hasSpecial = password.chars()
                                     .anyMatch(ch -> !Character.isLetterOrDigit(ch));

        boolean hasMinLength = password.length() >= 8;

        return hasUppercase && hasDigit && hasSpecial && hasMinLength;
    }
}
