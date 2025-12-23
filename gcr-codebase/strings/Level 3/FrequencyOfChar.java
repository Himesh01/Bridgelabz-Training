import java.util.*;

public class FrequencyOfChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String s = sc.nextLine();

        int[][] result = findFrequency(s);

        System.out.println("\nCharacter | Frequency");
        for (int i = 0; i < result.length; i++) {
            char ch = (char) result[i][0]; 
            int freq = result[i][1];
            System.out.println("    " + ch + "     |    " + freq);
        }
        sc.close();
    }
	//method to find frequency of characters
    public static int[][] findFrequency(String text) {
        int[] freqArray = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freqArray[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freqArray[i] > 0) {
                uniqueCount++;
            }
        }

        int[][] storage = new int[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freqArray[i] > 0) {
                storage[index][0] = i;
                storage[index][1] = freqArray[i];
                index++;
            }
        }
        return storage;
    }
}
