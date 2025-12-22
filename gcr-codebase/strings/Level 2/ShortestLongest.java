import java.util.Scanner;

public class ShortestLongest{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text: ");
        String inputText = scanner.nextLine();

        String[] words = splitTextIntoWords(inputText);

        String[][] wordLengthArray = createWordLengthArray(words);

        int[] result = findShortestAndLongest(wordLengthArray);

        System.out.println("Shortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);
    }
    // Method to split the text into words without using String.split()
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
                currentWord += ch;
            } else {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord; // Add word to the array
                    currentWord = "";
                }
            }
        }

        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord;
        }

        return words;
    }

    // Method to find the length of a word without using length() method
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
	
    // Method to find the shortest and longest words and their lengths
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = Integer.MIN_VALUE;
        String shortestWord = "";
        String longestWord = "";

        for (int i = 0; i < wordLengthArray.length; i++) {
            int length = Integer.parseInt(wordLengthArray[i][1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestWord = wordLengthArray[i][0];
            }

            if (length > longestLength) {
                longestLength = length;
                longestWord = wordLengthArray[i][0];
            }
        }
        return new int[]{shortestLength, longestLength};
    }
}
