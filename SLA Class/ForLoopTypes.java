package com.dev;

import java.util.Arrays;
import java.util.List;

public class ForLoopTypes {

	public static void main(String[] args) {

		//1. Simple For Loop - This is the classic loop structure used when the number of iterations is known
		for (int i = 0; i < 5; i++) {
		    System.out.println("Count: " + i);
		}

		//2. Multiple variable loop
		for(int i=0,j=1; i<15||j<10 ; i++,j++)
		{
			System.out.println(i+" . "+j);
		}
		
		//3. j- (jagged array) - nested j for loop depends on i loop.
		int[][] jagged = {
			    {1, 2},
			    {3, 4, 5, 6},
			    {7, 8, 9}
			};
		for (int i = 0; i < jagged.length; i++) {
		    for (int j = 0; j < jagged[i].length; j++) {
		        System.out.print(jagged[i][j] + " ");
		    }
		    System.out.println();
		}

		//4. printf in java
	/*	Purpose: Prints formatted text using format specifiers.
		Behavior: Allows precise control over output layout (like decimal places, alignment, etc.).
		Use Case: When you need to format numbers, strings, or other data.*/
		
		String name="Lokesh";
		int age = 25;
		double score = 92.5;
		System.out.printf("Name: %s, Age: %d, Score: %.1f%n",name, age, score);
		
		
		//Labeled For Loop
		outerLoop:
			for (int i = 0; i < 3; i++) {
			    for (int j = 0; j < 3; j++) {
			        if (i == j) continue outerLoop;
			        System.out.println("i: " + i + ", j: " + j);
			    }
			}

		//5. Enhanced For Loop (For-Each Loop)
		int[] numbers = {1, 2, 3, 4, 5};
		for (int num : numbers) {
		    System.out.println(num);
		}

		//6. Nested For Loops
		for (int i = 1; i <= 3; i++) {
		    for (int j = 1; j <= 3; j++) {
		        System.out.println("i=" + i + ", j=" + j);
		    }
		}

		
		//7. Iterable’s forEach() Loop (Java 8+)
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		names.forEach(System.out::println);

		// Lambda expressions
		Runnable r = () -> System.out.println("Hello from Lambda!");
		r.run();
		
		//Only one line statement, you can also follow this.  
		for(int i=100;i>=50;i-=2) System.out.println(i);
		
		//for loop with conditional statement(break, continue, jump, goto) 
		for(int i=1; i<=10; i++)
		{
			if(i==5) continue;
			if(i==8) break;
			System.out.println(i);
		}

	}

}
