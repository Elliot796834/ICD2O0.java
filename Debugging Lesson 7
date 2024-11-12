import java.util.Scanner;

public class IntegerInputExample{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       
        try {
            // Prompt user to enter two numbers
            System.out.print("Input a whole number (a): ");
            double a = kb.nextDouble();
            System.out.print("Input another whole number (b): ");
            double b = kb.nextDouble();

            // Nested try-catch block to handle division
            try {
                // Perform division
                double result = a / b;
                System.out.println("Result of " + a + " / " + b + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }

        } catch (Exception e) {
            System.out.println("Bad input: " + e.getMessage());
        } finally {
            kb.close();
        }
    }
}
