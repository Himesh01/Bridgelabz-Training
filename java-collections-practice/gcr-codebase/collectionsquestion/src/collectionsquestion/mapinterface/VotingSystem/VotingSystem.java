package collectionsquestion.mapinterface.VotingSystem;

import java.util.*;

public class VotingSystem {

    private HashMap<String, Integer> voteMap = new HashMap<>();

    private LinkedHashMap<String, Integer> voteOrderMap = new LinkedHashMap<>();

    public void castVote(String candidate) {

        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

        voteOrderMap.put(candidate, voteOrderMap.getOrDefault(candidate, 0) + 1);
    }

    public void displaySortedResults() {
        System.out.println("\nVoting Results (Sorted by Candidate Name):");

        TreeMap<String, Integer> sortedMap = new TreeMap<>(voteMap);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }

    public void displayVoteOrder() {
        System.out.println("\nVotes in Order of Insertion:");

        for (Map.Entry<String, Integer> entry : voteOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }
    }

    public void displayRawVotes() {
        System.out.println("\nRaw Vote Storage (HashMap):");
        System.out.println(voteMap);
    }
}
