package collectionsquestion.mapinterface.VotingSystem;

public class VotingSystemMain {

    public static void main(String[] args) {

        VotingSystem system = new VotingSystem();

        system.castVote("Raj");
        system.castVote("Nitin");
        system.castVote("Nageshwar");
        system.castVote("Rajeev");
        system.castVote("Vansh");
        system.castVote("Pk");

        system.displayRawVotes();
        system.displayVoteOrder();
        system.displaySortedResults();
    }
}