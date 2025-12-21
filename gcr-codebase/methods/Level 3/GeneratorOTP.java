public class GeneratorOTP {
	public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs:");
        for (int i = 0; i < otpArray.length; i++) {
            System.out.println(otpArray[i]);
        }
		
        if (areUniqueOTPs(otpArray)) {
            System.out.println("All OTPs are unique!");
        } else {
            System.out.println("Some OTPs are duplicate.");
        }
    }

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to ensure that all OTPs generated are unique
    public static boolean areUniqueOTPs(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
