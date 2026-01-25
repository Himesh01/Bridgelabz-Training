package regex.ExtractionProblems;

import java.util.regex.*;
public class ExtractAllEmailAddresses {

    public static void main(String[] args) {

        String text = "Contact us at support@example.com and info@company.org";

        String regex = "[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}