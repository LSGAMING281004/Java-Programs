package com.dev;

import java.util.Scanner;
// Replace the set of element in array 
public class ArrayReplace {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int[] arr = new int[scanner.nextInt()];
		
		System.out.println("Enter "+arr.length+" values:");

		for(int i=0; i<arr.length; i++){
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Which possition replace:");
		int index = scanner.nextInt();
		System.out.println("Replace number:");
		int n = scanner.nextInt();
		
		//Replace
		arr[index-1] = n;
		System.out.println("Replaced succesfull:");
		for(int j:arr) System.out.println("Array is: "+j);
		scanner.close();

	}

}
