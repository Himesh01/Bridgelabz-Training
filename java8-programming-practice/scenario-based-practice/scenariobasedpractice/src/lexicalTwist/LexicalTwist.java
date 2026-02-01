package lexicalTwist;
import java.util.*;

public class LexicalTwist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String word1 = sc.nextLine();
        
        if (word1.trim().split("\\s+").length > 1) {
            System.out.println(word1 + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String word2 = sc.nextLine();
        
        if (word2.trim().split("\\s+").length > 1) {
            System.out.println(word2 + " is an invalid word");
            return;
        }

        String revWord1 = new StringBuilder(word1).reverse().toString();

        if (revWord1.equalsIgnoreCase(word2)) {
        	
            String result = revWord1.toLowerCase().replaceAll("[aeiou]", "@");
            System.out.println(result);
        } 
        else {
            String combined = (word1 + word2).toUpperCase();
            String vowels = "", consonants = "";
            String allVowels = "AEIOU";

            for (char c : combined.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (allVowels.indexOf(c) != -1) vowels += c;
                    else consonants += c;
                }
            }

            if (vowels.length() > consonants.length()) {
                printFirstTwoUnique(vowels);
            } else if (consonants.length() > vowels.length()) {
                printFirstTwoUnique(consonants);
            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }

    private static void printFirstTwoUnique(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1) {
                result += c;
            }
            if (result.length() == 2) break;
        }
        System.out.println(result);
    }
}
