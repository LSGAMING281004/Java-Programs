package JavaTest;

import java.util.Scanner;

// Print the value all display function
class Display{
	public void display(int[] arr) {	
		for(int i:arr) {
				System.out.println(i);
		}
		endLine();
	}
	
	public void display(String[] arr) {
		
		for(String i:arr) {
				System.out.println(i);
		}
		endLine();
	}
	
	public void display(int num) {
		System.out.println(num);
		endLine();
	}
	
	public void display(String str) {
		System.out.println(str);
		endLine();
	}
	public void display(int[][] mulTwoArray) {
		for (int[] row : mulTwoArray) {
	        for (int val : row) {
	            System.out.println(val);
	        }
	    }
	}
	
	public void endLine() {
		System.out.println("\n-----------------------------------------------------------\n");
	}

	
}

// Process of the logic
class Solution{
	Display disp = new Display();
	
	// Write a program to count how many even and odd numbers are in an array between 1 to 20
	String countOfEvenOdd(int number){
	
		if(number%2 != 0) return ("Even Count:"+number/2+"  Odd Count:"+(number/2+1));
		else return ("Even Count:"+number/2+"  Odd Count:"+number/2);
		
	}
	
	// Write a program to reverse the elements of an array in-place.
	int[] reverseArray(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length/2;i++) {
			
			temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		return arr;
	}
	
	// Calculate and print the sum of all elements in a given array.
	int sumOfArray(int[] arr) {
		
		int sum=0;
		for(int i:arr) {
			sum += i;
		}
		return sum; 
	}
	
	// Find the second smallest number in an array.
	int secondSmallest(int[] arr) {
		
		int secMin=0,min=arr[0];
		
		for(int i:arr) {
			if(min >= i) {
				secMin = min;
				min = i;
			}
		}
		return secMin;
	}
	
	// Find the index of an array element
	String indexOfElement(int[] arr) {
		
		System.out.println("This is a array element:");
		disp.display(arr);
		System.out.println("Above the block of values is array \n Enter a value to find index");
		int val = inputNum();
		String result = "index: ";
		for(int i=0;i<arr.length;i++) {
			if(val == arr[i])
				result += String.valueOf(i)+", ";
		}
		return result;
	}
	
	// Remove specific element from array
	int[] removeElement(int[] arr) {
		System.out.println("This is a array element:");
		disp.display(arr);
		System.out.println("Above the block of values is array \n Enter a value to 'remove element'");
		int value = inputNum();
		int count = 0;
		
		for(int num:arr) {
			if(value != num) {
				count++;
			}
		}
		
		int[] newArr = new int[count];
		int index = 0;
		for(int i:arr) {
			if(value != i) {
				newArr[index] = i;
				index++;
			}
		}
		System.out.println("After removed array value:");
		return newArr;
	}
	
	// Common elements in two string arrays
	String commonString(String[] str1, String[] str2) {
		String commonWords = "";
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str2.length;j++) {
				if(str1[i] == str2[j]) {
					commonWords += str1[i]+", ";
				}
			}
		}
		return commonWords;
	}
	
	// Check if two arrays are equal
	String isArraySame(int[] nums1,int[] nums2) {
		if(nums1.length != nums2.length) return "Two arrays are not same";
		for(int i=0;i<nums1.length;i++) {
			
				if(nums1[i] == nums2[i]) {
					
				}else {
					return "Two arrays are not same";
				}
		}
		return "Two arrays are same";
	}
	
	// Difference between max and min values
	int diffMaxMin(int max, int min) {
		if((max-min) < 0)
			return -(max-min);
		else
			return max-min;
	}
	
	// Multiplication of 3* 3 array
	int[][] mulTwoArray(int[][] arr1,int[][] arr2) {
		int[][] mularr = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mularr[i][j] = arr1[i][j] * arr2[i][j]; 
			}
		}
		return mularr;
	}
	
	// Input scanner method 
	@SuppressWarnings("resource")
	int inputNum()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num = scanner.nextInt();
		return num;
	}
}

// Main class
public class Test4 {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		Display displayObj = new Display();
	
		displayObj.display(solution.countOfEvenOdd(20));
		displayObj.display(solution.reverseArray(new int[]{10,20,30,40,50}));
		displayObj.display(solution.sumOfArray(new int[]{100,200,300,400,500}));
		displayObj.display(solution.secondSmallest(new int[]{25,44,25,18,15}));
		displayObj.display(solution.indexOfElement(new int[]{1,2,3,2,3,9}));
		displayObj.display(solution.removeElement(new int[]{1,2,3,2,3,9}));
		displayObj.display(solution.commonString(new String[] {"Lokesh","ls","L","steve","life"},new String[] {"Lokesh","L","Steve","ls","Gokul","Best"}));
		displayObj.display(solution.isArraySame(new int[]{1,2,3,2,3,9}, new int[]{1,2,3,2,3,9}));
		displayObj.display(solution.diffMaxMin(20,31));
		displayObj.display(solution.mulTwoArray(new int[][]{{10, 20, 30}, {40, 50, 60},{70, 80, 90}}, new int[][]{{1, 2, 3}, {4, 5, 6},{7, 8, 9}}));
	}
}
