import java.util.Scanner;

public class RockPaperScissors {
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of games to play: ");
        int totalGames = scanner.nextInt();
        
        int userWins = 0;
        int computerWins = 0;
        
        for (int i = 1; i <= totalGames; i++) {
            System.out.println("\nGame " + i + ": Choose Rock, Paper, or Scissors:");
            String userChoice = scanner.next();
            userChoice = userChoice.substring(0, 1).toUpperCase() + userChoice.substring(1).toLowerCase();
            
            if (!userChoice.equals("Rock") && !userChoice.equals("Paper") && !userChoice.equals("Scissors")) {
                System.out.println("Invalid choice! Please choose Rock, Paper, or Scissors.");
                i--;
                continue;
            }
            
            String computerChoice = getComputerChoice();
            
            String winner = determineWinner(userChoice, computerChoice);
            
            System.out.println("User Choice: " + userChoice);
            System.out.println("Computer Choice: " + computerChoice);
            System.out.println("Winner: " + winner);
            
            if (winner.equals("User")) {
                userWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }
        
        displayResults(userWins, computerWins, totalGames);
        
    }
    // Method to find the Computer's choice (Random selection)
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            default: return "Scissors";
        }
    }

    // Method to determine the winner of a single game
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Tie";
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate the win statistics and return a 2D array
    public static String[][] getStatistics(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3];
        
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0 / totalGames)) + "%";
        
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0 / totalGames)) + "%";
        
        return stats;
    }

    // Method to display the results in tabular format
    public static void displayResults(int userWins, int computerWins, int totalGames) {
        String[][] stats = getStatistics(userWins, computerWins, totalGames);
        
        System.out.println("\n Game Results ");
        System.out.println("Game No.\tUser Choice\tComputer Choice\tWinner");
        
        System.out.println("Total Games: " + totalGames);
        System.out.println("User Wins: " + userWins + " (" + stats[0][2] + ")");
        System.out.println("Computer Wins: " + computerWins + " (" + stats[1][2] + ")");
    }
}
