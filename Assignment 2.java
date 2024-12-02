import java.util.ArrayList;
import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "y"; // Initialize the choice variable

        do {
            System.out.print("Enter a whole number > 0: ");
            
            // Check for valid input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a positive whole number.");
                scanner.next(); // Clear invalid input
            }
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer.");
                continue;
            }

            ArrayList<Integer> sequence = new ArrayList<>();
            int current = n;
            int highestValue = n;
            int terms = 0;

            while (current != 1) {
                sequence.add(current);
                terms++;
                if (current > highestValue) {
                    highestValue = current;
                }
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = 3 * current + 1;
                }
            }
            sequence.add(1);
            terms++;

            System.out.print("The Collatz sequence for n = " + n + " is: ");
            for (int i = 0; i < sequence.size(); i++) {
                if (i > 0) System.out.print("; ");
                System.out.print(sequence.get(i));
            }
            System.out.println();

            System.out.println("Number of terms = " + terms);
            System.out.println("Highest value reached = " + highestValue);

            System.out.print("Do another? (y/n) ");
            choice = scanner.next().trim(); // Trim whitespace to handle accidental spaces

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Goodbye!");
        scanner.close();
    }
}
