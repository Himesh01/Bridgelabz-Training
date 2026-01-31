package functionalInterface.staticmethodsinInterface.passwordValidator;

public class PasswordValidatorTest {
	public static void main(String[] args) {

        String password = "Test@123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
}
