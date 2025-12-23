import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        if (isAnagram(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are NOT anagrams.");
        }
        
        scanner.close();
    }
    //Method to check if two strings are anagrams using character frequency.
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCounts = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            charCounts[str1.charAt(i)]++;
            charCounts[str2.charAt(i)]--;
        }

        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
