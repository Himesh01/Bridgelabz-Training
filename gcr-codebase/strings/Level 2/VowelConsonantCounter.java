import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        int[] result = countVowelsConsonants(s);

        System.out.println("Vowels Count: " + result[0]);
        System.out.println("Consonants Count: " + result[1]);
    }
	
    // Method to check if the character is a vowel or consonant
    public static String checkCharacterType(char ch) {
        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to find vowels and consonants in the string and return their count
    public static int[] countVowelsConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); 
            String characterType = checkCharacterType(ch);
            if (characterType.equals("Vowel")) {
                vowelCount++;
            } else if (characterType.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }
}
