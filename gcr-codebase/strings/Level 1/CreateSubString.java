import java.util.*;

public class CreateSubString{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings");
		String s1 = sc.next();
		
		System.out.println("Enter start index ");
		int start = sc.nextInt();
		
		System.out.println("Enter end index ");
		int end = sc.nextInt();
		
		if(start <0 || end > s1.length() || start > end){
			System.out.println("Invalid start or end index");
			return;
		}
		
		String chMethod = createSubString(s1,start,end);
		System.out.println("Substring using charAt(): " + chMethod);
		
		String builtIn = s1.substring(start, end);
		System.out.println("Substring using built-in substring(): " + builtIn);
		
		boolean areEqualByCharAt = compareStrings(chMethod, builtIn);
        boolean areEqualByBuiltIn = chMethod.equals(builtIn);
		
		System.out.println("Comparison results:");
        System.out.println("Strings are equal using custom charAt() comparison: " + areEqualByCharAt);
        System.out.println("Strings are equal using built-in equals() comparison: " + areEqualByBuiltIn);

		
	}
	// method to create a substring
	public static String createSubString(String s1, int start ,int end){
		String result = "";
		for(int i= start; i<end; i++){
			result += s1.charAt(i);
		}
		return result;
	}
	
	// method to compare two strings
	public static boolean compareStrings(String str1, String str2){
		if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
		