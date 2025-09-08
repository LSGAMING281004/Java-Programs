package com.dev;

import java.util.Scanner;

public class Arrays {
	

	static double sumOfArray(int arr[])
	{
		double sum=0;
		for(int i=0; i<arr.length; i++) sum+=arr[i]; 
		return sum;
	}
	
	static int getIndexValue(int arr[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Index:");
		int index = scan.nextInt();
		
		if(index>=0 && index<arr.length)
		{
			System.out.println("Index "+index+" value:"+arr[index]);
		}else System.out.println("Invalid index");
		scan.close();
		return arr[index];
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of values:");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter "+i+" value:");
			arr[i] = scan.nextInt();		
		}
		
		for(int j=0;j<n ;j++) System.out.println(arr[j]);
		
		System.out.println("Sum of array is:"+sumOfArray(arr));
		System.out.println("The index is:"+getIndexValue(arr));

		
		scan.close();
		
	}

}
