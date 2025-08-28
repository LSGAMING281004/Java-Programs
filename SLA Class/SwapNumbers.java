package com.dev;

import java.util.Scanner;

public class SwapNumbers {
	
	void swapUsingTwoVariables(int x, int y)
	{
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("After swap: num1="+x+"  num2="+y);
	}

	public static void main(String[] args) {
		
		SwapNumbers swap = new SwapNumbers();
		int num1,num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values of num1 & num2:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		System.out.println("Before value num1="+num1+"  num2="+num2);
		swap.swapUsingTwoVariables(num1,num2);
		scanner.close();
	}

}
