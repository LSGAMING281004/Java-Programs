package com.dev;

import java.util.Scanner;
public class IsSameArray {
//Find two array are same values but the values any index an array. 
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		int count = 0;
		int[] userArr = new int[arr.length];
		boolean flag = false;
		System.out.println("Enter values:");
		for(int i=0; i<arr.length; i++)
		{
			userArr[i] = scan.nextInt(); 
			for(int j=0; j<arr.length; j++)
			{
				if(userArr[i] == arr[j])
				{
					count++;
					flag = true;
					arr[j] = 0;
				}
			}
			if(!flag){
				System.out.println("Your value not same");
				break;
			}
			flag = false;
		}
		
		if(count == arr.length)
			System.out.println("Yes same value");
		scan.close();

	}
}
