import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate sum, difference, product, and quotient
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Handle division by zero case
        int quotient = (num2 != 0) ? (num1 / num2) : 0;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (num2 != 0) {
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
        }
        scanner.close();
    }
}
