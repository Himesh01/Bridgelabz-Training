import java.util.Scanner;

public class VowelConsonantType{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String s = scanner.nextLine();

        String[][] characterTypes = findCharacterTypes(s);

        displayCharacterTypes(characterTypes);
    }

    // Method to check if the character is a vowel, consonant, or not a letter
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

    // Method to find vowels and consonants in the string and return the character with its type in a 2D array
    public static String[][] findCharacterTypes(String text) {
        String[][] characterTypes = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            characterTypes[i][0] = String.valueOf(ch);
            characterTypes[i][1] = type;
        }
        return characterTypes;
    }

    // Method to display the 2D array in tabular format
    public static void displayCharacterTypes(String[][] characterTypes) {
        System.out.println("Character\tType");
        for (int i = 0; i < characterTypes.length; i++) {
            System.out.println(characterTypes[i][0] + "\t\t" + characterTypes[i][1]);
        }
    }
}
