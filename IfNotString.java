import java.util.Scanner;

public class IfNotString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string Value to convert to integer");
		String str = scanner.nextLine();
		try {
			int var = Integer.parseInt(str);
			System.out.println("Enter string to Integer:" + var);
		} catch (Exception e) {
			System.out.println("Can not convert from string to Integer\n" + e);
		}
		scanner.close();
	}
}
