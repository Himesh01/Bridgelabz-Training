package day2.ChatLogParser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    private static final Pattern LOG_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s(.*?):\\s(.*)");

    public static Map<String, List<String>> parseChatLog(
            String filePath, MessageFilter<String> filter) throws IOException {

        Map<String, List<String>> userMessages = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {

                Matcher matcher = LOG_PATTERN.matcher(line);

                if (matcher.matches()) {
                    String time = matcher.group(1);
                    String user = matcher.group(2);
                    String message = matcher.group(3);

                    if (filter.allow(message)) {
                        userMessages.computeIfAbsent(user, k -> new ArrayList<>()).add("[" + time + "] " + message);
                    }
                }
            }
        }
        return userMessages;
    }
}