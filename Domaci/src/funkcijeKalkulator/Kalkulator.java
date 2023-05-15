package funkcijeKalkulator;
import java.util.Scanner;

public class Kalkulator {

		
		
		public static double kalkulator(double op1, double op2, String op) {
			
			switch(op) {
			
			case "+":
				
				return op1 + op2;
				
			case "-":
				
				return op1 - op2;
				
			case "*":
				
				return op1 * op2;
				
			case "/":
				if(op2 !=0) {
				
				return op1 / op2;
				}
				
			default:
				System.out.println("Operation " + op + " not supported.");
				
				return 0;
		}
	}
		
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter first operand: ");
			double op1 = Double.parseDouble(scanner.nextLine());
			
			System.out.print("Enter second operand: ");
			double op2 = Double.parseDouble(scanner.nextLine());
			
			System.out.print("Enter operation: ");
			String op = scanner.nextLine();
			
			scanner.close();
			
			
			System.out.println("Result is " + kalkulator(op1, op2, op));

			
		}

}
