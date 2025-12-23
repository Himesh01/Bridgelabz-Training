import java.util.Scanner;

public class VotingEligibility {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int numStudents = 10;

        int[] ages = generateAges(numStudents);

        String[][] votingEligibility = checkVotingEligibility(ages);

        displayVotingEligibility(votingEligibility);
		
    }
    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 83) + 18; 
        }
        return ages;
    }

    // Method to check voting eligibility based on age
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Can Vote";
            } else {
                eligibility[i][0] = String.valueOf(ages[i]);
                eligibility[i][1] = "Cannot Vote";
            }
        }
        return eligibility;
    }

    // Method to display the 2D array in tabular format
    public static void displayVotingEligibility(String[][] result) {
        System.out.println("Age\t\tEligibility");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
}
