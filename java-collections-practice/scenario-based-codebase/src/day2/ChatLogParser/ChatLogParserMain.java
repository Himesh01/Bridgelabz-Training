package day2.ChatLogParser;

import java.util.*;

public class ChatLogParserMain{
    public static void main(String[] args) throws Exception {

        String filePath = "chatlog.txt";

        MessageFilter<String> filter = new IdleChatFilter();

        Map<String, List<String>> result =
                ChatLogParser.parseChatLog(filePath, filter);

        result.forEach((user, messages) -> {
            System.out.println("\nUser: " + user);
            messages.forEach(msg -> System.out.println("   " + msg));
        });
    }
}
