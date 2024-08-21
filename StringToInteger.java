import java.util.Scanner;

public class StringToInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Prompt the user to enter a string
		System.out.print("Enter a string that represents an integer: ");
		String input = scanner.nextLine();
		int intValue = Integer.parseInt(input);
		System.out.println("Entered string to integer: " + intValue);
		scanner.close();
	}
}