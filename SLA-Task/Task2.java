package com.dev;

import java.util.Scanner;

public class Task2 {
	
	public String ifPositiveOrNegative(int num)
	{
		if(num > 0)
			return "Positive Number";
		else if(num == 0)
			return "Zero";
		else
			return "Negative Number";
	}
	
	public String ifOddOrEven(int num)
	{
		if(num%2 == 0)
			return "Even Number";
		else
			return "Odd Number";
	}
	
	public String ifPrime(int num)
	{
		 if (num <= 1) {
	            return "Not Prime Number"; // 0, 1 and negative numbers are not prime
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return "Not Prime Number"; // divisible by some number other than 1 and itself
	            }
	        }
	        return "Prime Number";
	}
	
	public String ifLeapYear(int num)
	{
		if(num < 0)
			return "Not a Leap Year";
		if((num%4 == 0 && num%100 != 0) || (num%400 == 0))
			return "Leap Year";
		else
			return "Not a Leap Year";
	}
	
	public int reverseString(int num)
	{
		int rev = 0;
        
        while (num != 0) {
            int digit = num % 10;   // extract last digit
            rev = rev * 10 + digit; // build reverse number
            num = num / 10;         // remove last digit (no increment used)
        }
		return rev;
	}
	
	
	public static void main(String[] args)
	{
		Task2 task = new Task2();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int input = scanner.nextInt();
		
		System.out.println(task.ifPositiveOrNegative(input));
		System.out.println(task.ifOddOrEven(input));
		System.out.println(task.ifPrime(input));
		System.out.println(task.ifLeapYear(input));
		System.out.println(task.reverseString(input));
		
		scanner.close();
		
	}
}
