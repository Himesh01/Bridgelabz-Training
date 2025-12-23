import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string");
        String sentence = sc.nextLine();
        
        String longest = "";
        String current = "";
        sentence += " "; 

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                current += ch;
            } else {
                if (current.length() > longest.length()) {
                    longest = current;
                }
                current = "";
            }
        }

        System.out.println("Longest word: " + longest);
    }
}

