package day2.ChatLogParser;

import java.util.*;

public class IdleChatFilter implements MessageFilter<String> {

    private final Set<String> idleKeywords = Set.of("lol", "brb", "rofl", "ttyl", "afk");

    @Override
    public boolean allow(String message) {
        String lower = message.toLowerCase();
        return idleKeywords.stream().noneMatch(lower::contains);
    }
}