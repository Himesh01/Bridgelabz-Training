package regex.AdvancedProblems;
import java.util.regex.*;

public class FindRepeatingWords {
	public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        String regex = "\\b(\\w+)\\s+\\1\\b";

        Matcher m = Pattern.compile(regex).matcher(text);

        while(m.find()) {
            System.out.println(m.group(1));
        }
    }
}
