import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first value:");
		float firstValue = scanner.nextFloat();
		System.out.println("Enter second value:");
		float secondValue = 2;
		
		float sum = calculator.sum(firstValue, secondValue);
		System.out.println(firstValue + "+" + secondValue + " = " + sum);
		String operator = scanner .next();
		scanner.close();
	}
}
