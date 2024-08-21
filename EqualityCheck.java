import java.util.Scanner;

public class EqualityCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Check if the two numbers are equal using ==
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers are not equal.");
        }
        scanner.close();
    }
}
