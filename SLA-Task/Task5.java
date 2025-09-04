package JavaTask;

import java.util.Scanner;

//Write an interface Calculator with methods for add, subtract, multiply, and divide. Implement it in a class BasicCalculator

interface Calculator
{
	double addition(double a, double b);
	double subtract(double a, double b);
	double multiply(double a, double b);
	double divide(double a, double b);
}

class BasicCalculator implements Calculator
{

	@Override
	public double addition(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double subtract(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiply(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}


	
}


public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalculator basicCals = new BasicCalculator();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		double num1 = scanner.nextDouble();
		System.out.print("Enter secoend number:");
		double num2 = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Enter operator:");
		char operator = scanner.nextLine().charAt(0);
		
		switch(operator)
		{
		case '+':
			System.out.println(basicCals.addition(num1, num2));
			break;
		case '-':
			System.out.println(basicCals.subtract(num1, num2));
			break;
		case '*':
			System.out.println(basicCals.multiply(num1, num2));
			break;
		case '/':
			System.out.println(basicCals.divide(num1, num2));
			break;
		default:
			System.out.println("Invalid Operator");
			
		}
		System.out.println("Execution End");
		scanner.close();
	}

}
