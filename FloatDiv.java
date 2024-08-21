import java.util.Scanner;

public class FloatDiv {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter float1 value");
		float f1 = scanner.nextFloat();
		System.out.println("enter float2 value");
		float f2 = scanner.nextFloat();
		int div = (int) (f1 / f2);
		System.out.println("int value of float values div: " + div);
		scanner.close();
	}
}
