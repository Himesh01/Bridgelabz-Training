package functionalInterface.stringlengthchecker;

import java.util.function.Function;
public class CharcterLimit {
	public static void main(String[] args) {
		
		int limit =20;
		Function<String, Integer> lengthCalculator = message->message.length();
		
		String message = "Your appointment is confirmed";

        int length = lengthCalculator.apply(message);

        if (length > limit) {
            System.out.println("Message too long (" + length + " characters)");
        } else {
            System.out.println("Message length OK (" + length + " characters)");
        }
	}
}
