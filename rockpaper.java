import java.util.Scanner;

public class SimpleRockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.print("How many games do you want to play? ");
        int totalGames = scanner.nextInt();

        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        for (int game = 1; game <= totalGames; game++) {
            System.out.println("Game " + game + ":");
            System.out.print("Enter 1 for Rock, 2 for Paper, or 3 for Scissors: ");
            int playerChoice = scanner.nextInt();

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                game--;
                continue;
            }

            int computerChoice = (int) (Math.random() * 3) + 1;

            System.out.println("You chose: " + (playerChoice == 1 ? "Rock" : playerChoice == 2 ? "Paper" : "Scissors"));
            System.out.println("Computer chose: " + (computerChoice == 1 ? "Rock" : computerChoice == 2 ? "Paper" : "Scissors"));

            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
                ties++;
            } else if ((playerChoice == 1 && computerChoice == 3) ||
                       (playerChoice == 2 && computerChoice == 1) ||
                       (playerChoice == 3 && computerChoice == 2)) {
                System.out.println("You win this round!");
                playerWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            System.out.println();
        }

        System.out.println("Game Over!");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Ties: " + ties);

        scanner.close();
    }
}
