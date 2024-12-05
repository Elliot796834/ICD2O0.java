import java.util.Scanner;

public class scope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many games do you want to play? ");
        int totalGames = scanner.nextInt();
        scanner.nextLine();

        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        for (int i = 1; i <= totalGames; i++) {
            System.out.println("Game " + i + ":");
            System.out.print("Enter 'r' for Rock, 'p' for Paper, or 's' for Scissors: ");
            char playerChoice = scanner.nextLine().toLowerCase().charAt(0);

            if (playerChoice != 'r' && playerChoice != 'p' && playerChoice != 's') {
                System.out.println("Invalid choice! Please enter 'r', 'p', or 's'.");
                i--;
                continue;
            }

            int computerRandomChoice = (int) (Math.random() * 3);
            char computerChoice = (computerRandomChoice == 0) ? 'r' : (computerRandomChoice == 1) ? 'p' : 's';

            System.out.println("Computer chose: " + computerChoice);

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

            System.out.println();
        }

        System.out.println("Game Over! Final Score:");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);

        scanner.close();
    }
}
