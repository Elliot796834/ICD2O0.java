import java.util.Scanner;

public class scope {
    public static void main(String[] args) {
        // Initialize the scanner to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the player how many games they want to play
        System.out.print("How many games do you want to play? ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Initialize variables for wins, losses, and ties
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        // Loop through the number of games to be played
        for (int i = 1; i <= totalGames; i++) {
            System.out.println("Game " + i + ":");
            // Ask the user for their choice
            System.out.print("Enter 'r' for Rock, 'p' for Paper, or 's' for Scissors: ");
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0); // Make sure it's lowercase

            // Ensure the player enters a valid choice
            if (playerChoice != 'r' && playerChoice != 'p' && playerChoice != 's') {
                System.out.println("Invalid choice! Please enter 'r', 'p', or 's'.");
                i--; // Decrease game count to retry the current game
                continue; // Skip the rest of the loop and ask for input again
            }

            // The computer randomly chooses rock, paper, or scissors
            int computerRandomChoice = (int) (Math.random() * 3); // 0 for rock, 1 for paper, 2 for scissors
            char computerChoice = (computerRandomChoice == 0) ? 'r' : (computerRandomChoice == 1) ? 'p' : 's';

            // Display the computer's choice
            System.out.println("Computer chose: " + computerChoice);

            // Determine the outcome of the game
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((playerChoice == 'r' && computerChoice == 's') ||
                       (playerChoice == 'p' && computerChoice == 'r') ||
                       (playerChoice == 's' && computerChoice == 'p')) {
                System.out.println("You win this round!");
                playerWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            System.out.println(); // Add a blank line between games
        }

        // After all games, display the results
        System.out.println("Game Over! Final Score:");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);

        // Close the scanner
        scanner.close();
    }
}
