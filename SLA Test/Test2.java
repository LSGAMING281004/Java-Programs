package JavaTest;

import java.util.Scanner;
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class Test2 {

	Scanner scanner = new Scanner(System.in);
	
	void multiplicationTable() // 1. Write a program to print the multiplication table using any loop.
	{
		System.out.print("Enter the table:");
		int table = scanner.nextInt();
		for(int i=1; i<=10; i++) System.out.println(i+" X "+table+" = "+table*i);
	}
	
	// 2. Write a program to find the largest of two numbers using ternary operator
	void largestNum()
	{
		int num1=374, num2=476;
		System.out.println((num1 > num2) ? "It is a Large: "+num1 : "It is a Large: "+num2);
	}
	
	// 3. Write a program to find the largest of 2nd number
	void secondLargestNum()
	{
		int[] arr = {1,5,10,15};
		int max1=0,max2=0;
		for(int i:arr)
		{
			if(max1 < i){
				max2 = max1;
				max1 = i;
			}
		}
		System.out.println("Second largest number: "+max2);
	}
	
	// 4. Write a program to find the factorial of a number
	void factorial()
	{
		System.out.print("Enter the number:");
		int factNum = scanner.nextInt(), factIs=1;
		
		for(int i=1; i<=factNum; i++) factIs += factIs*i;
		System.out.println("Factorial: "+factIs);
	}
	
	// 5. Write a program to print the grade of the student using subject (O>90, A>80, B>70, C>60, Fail)
	void studentGrade() {
		System.out.print("Enter student mark:");
		int mark = scanner.nextInt();
		String grade;
		
		if(mark>90) grade = "Your grade 'O+'";
		else if(mark>80) grade = "Your grade 'A'";
		else if(mark>70) grade = "Your grade 'B'";
		else if(mark>60) grade = "Your grade 'C'";
		else grade = "Your 'Fail'";
		System.out.println(grade);
	}
	
	// 6. Write a program to print the square of given number
	void squareOfNumber()
	{
		System.out.print("Enter number:");
		int number = scanner.nextInt();
		System.out.println("Square is: "+number*number);
	}
	
	// 7. Design a calculator using switch(+, -, *, /, %)
	void cals()
	{
		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter Second number: ");
		int num2 = scanner.nextInt();
		System.out.print("Enter operation: Like(+, -, *, /, %): ");
		scanner.nextLine();
		char op = scanner.nextLine().charAt(0);
		int result=0;
		switch(op)
		{
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		case '%':
			result = num1%num2;
			break;
		default:
			System.out.println("Invalid");
			cals();
		}
		System.out.println("Result: "+result);
	}
	
	// 8. Write a program to print the week day using enum(mon, tues, wed, thru, friday)
	void eNum(){
		for (Day d : Day.values()) System.out.println(d);
	}
	
	// 9. Write a program to find the sum of prime number using 1 to 100
	void sumOfPrime() {
		int num = 2;
		int sum = 0;
		boolean isPrime = true;
		
		
		while(num < 100) {
		for (int i = 2; i <= Math.sqrt(num); i++)  if (num % i == 0) isPrime = false;
    
		if (isPrime) sum += num;
	            
	    num++;
	    isPrime = true;
		} 
		System.out.println("The sum of prime: "+sum);
	}
	
	// 10. Write a program to print the sum of even and odd numbers.
	void sumOfEvenOdd() {
		System.out.print("Enter no. of length:");
		int n = scanner.nextInt();
		int even=0,odd=0;
		for(int i=1; i<=n; i++) {
			if(i%2 == 0) even += i;
			else odd += i;	
		}
		System.out.println("Sum of Even: "+even+"  Sum of Odd: "+odd);
	}
	
	public static void main(String[] args)
	{
		Test2 test = new Test2();
		
		test.multiplicationTable();
		test.largestNum();
		test.secondLargestNum();
		test.factorial();
		test.studentGrade();
		test.squareOfNumber();
		test.cals();
		test.eNum();
		test.sumOfPrime();
		test.sumOfEvenOdd();
		
		
	}
}
