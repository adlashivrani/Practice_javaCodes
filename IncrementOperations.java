import java.util.Scanner;

public class IncrementOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the initial value of the variable
        System.out.println("Initial value: " + number);

        // Using pre-increment
        System.out.println("After pre-increment: " + ++number);

        // Using post-increment
        System.out.println("After post-increment: " + number++);

        // Display the final value after post-increment
        System.out.println("Current value after post-increment: " + number);
        scanner.close();
    }
}
