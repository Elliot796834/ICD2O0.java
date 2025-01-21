import java.io.File;
import java.util.Scanner;

public class CreditCardBalance {
    // Function to calculate the month's balance
    public static double calculateBalance(double startingBalance, double recentPurchase, double recentPayment) {
        return startingBalance + recentPurchase - recentPayment;
    }

    // Function to calculate the final balance with interest
    public static double finalBalance(double oldBal, double purchase, double payment) {
        double newBalance = calculateBalance(oldBal, purchase, payment);
        // Apply interest if the balance is positive
        if (newBalance > 0) {
            newBalance *= 1.28; // 28% interest
        }
        return newBalance;
    }

    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\796834\\OneDrive - Peel District School Board\\Documents\\NetBeansProjects\\CreditCardBalance\\src\\ledger.dat"; // Input file
        String outputFileName = "balances.out"; // Output file

        int customerCount = 0;
        double sumFinalBalances = 0.0;
        String highestBalanceAccount = "";
        double highestBalance = Double.MIN_VALUE;
        String lowestBalanceAccount = "";
        double lowestBalance = Double.MAX_VALUE;

        try (Scanner fileScanner = new Scanner(new File(inputFileName))) {
            // Create a StringBuilder to hold the output
            StringBuilder outputBuilder = new StringBuilder();
            outputBuilder.append("Account Number, Final Balance\n");

            while (fileScanner.hasNextLine()) {
                // Read a line from the file
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                // Extract account details
                String accountNumber = parts[2];
                double startingBalance = Double.parseDouble(parts[3]);
                double recentPurchase = Double.parseDouble(parts[4]);
                double recentPayment = Double.parseDouble(parts[5]);

                // Calculate the final balance using the new function
                double finalBalance = finalBalance(startingBalance, recentPurchase, recentPayment);

                // Update totals and checks for highest/lowest balances
                customerCount++;
                sumFinalBalances += finalBalance;

                if (finalBalance > highestBalance) {
                    highestBalance = finalBalance;
                    highestBalanceAccount = accountNumber;
                }

                if (finalBalance < lowestBalance) {
                    lowestBalance = finalBalance;
                    lowestBalanceAccount = accountNumber;
                }

                // Append to output
                outputBuilder.append(accountNumber).append(", ").append(String.format("%.2f", finalBalance)).append("\n");
            }

            // Compute average balance
            double averageBalance = sumFinalBalances / customerCount;

            // Append summary to output
            outputBuilder.append("\nSummary:\n");
            outputBuilder.append("Highest Balance: ").append(highestBalanceAccount).append(", ").append(String.format("%.2f", highestBalance)).append("\n");
            outputBuilder.append("Lowest Balance: ").append(lowestBalanceAccount).append(", ").append(String.format("%.2f", lowestBalance)).append("\n");
            outputBuilder.append("Average Balance: ").append(String.format("%.2f", averageBalance)).append("\n");

            // Print the output to the console
            System.out.println(outputBuilder.toString());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
