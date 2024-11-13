import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Please input the first number: ");
        double num1 = Double.parseDouble(scan.nextLine());

        // Ask the user for the second number
        System.out.print("Please input the second number: ");
        double num2 = Double.parseDouble(scan.nextLine());

        // Ask the user for the operator
        System.out.print("Please input an operator (+, -, *, or /): ");
        char operator = scan.nextLine().charAt(0);

        // Perform the operation based on the operator
        double result = 0.0;
        boolean validOperation = true;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                validOperation = false;
            }
        } else {
            System.out.println("Invalid operator.");
            validOperation = false;
        }

        // Display the result if the operation was valid
        if (validOperation) {
            System.out.printf("%.1f %c %.1f = %.1f\n", num1, operator, num2, result);
        }

        scan.close();
    }
}
