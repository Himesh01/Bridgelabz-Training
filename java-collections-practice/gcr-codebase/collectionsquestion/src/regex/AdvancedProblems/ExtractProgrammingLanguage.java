package regex.AdvancedProblems;
import java.util.regex.*;

public class ExtractProgrammingLanguage {
	public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        Matcher m = Pattern.compile(regex).matcher(text);

        while(m.find()) {
            System.out.println(m.group());
        }
    }
}
