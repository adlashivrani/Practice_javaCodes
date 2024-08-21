import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Define two conditions
        boolean condition1 = num1 > 10;
        boolean condition2 = num2 < 20;

        // Display the conditions
        System.out.println("\nEvaluating conditions:");
        System.out.println("Condition 1 (num1 > 10): " + condition1);
        System.out.println("Condition 2 (num2 < 20): " + condition2);

        // Evaluate conditions using logical AND (&&)
        System.out.println("\nUsing logical AND (&&):");
        if (condition1 && condition2) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }

        // Evaluate conditions using logical OR (||)
        System.out.println("\nUsing logical OR (||):");
        if (condition1 || condition2) {
            System.out.println("At least one of the conditions is true.");
        } else {
            System.out.println("Both conditions are false.");
        }
        scanner.close();
    }
}
