package regex.ReplacendModifyStrings;

public class CensorBadWords {
	public static void main(String[] args) {
		String text = "This is a damn bad example with some stupid words.";
		System.out.println(text);
		
        String regex = "\\b(damn|stupid)\\b";

        String censored = text.replaceAll(regex, "****");

        System.out.println(censored);
	}
}
