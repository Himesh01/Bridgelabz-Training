import java.util.*;

public class WordLengthProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text: ");
        String s = sc.nextLine();

        String[] words = splitTextIntoWords(s);

        String[][] wordLengthArray = createWordLengthArray(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t" + Integer.parseInt(wordLengthArray[i][1]));
        }
    }
    // Method to split the text into words without using StringBuilder
    public static String[] splitTextIntoWords(String text) {
        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ' && text.charAt(i) != '\n' && text.charAt(i) != '\t') {
                if (!isWord) {
                    wordCount++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch != ' ' && ch != '\n' && ch != '\t') {
                currentWord += ch; // Add character to current word
            } else {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord;
                    currentWord = "";
                }
            }
        }
        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord;
        }

        return words;
    }

    // Method to find the length of a word without using the length() method
    public static String getLength(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        return String.valueOf(count);
    }

    // Method to create a 2D String array with word and its length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = getLength(words[i]);
        }
        return result;
    }
}
