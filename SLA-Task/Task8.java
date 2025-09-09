package JavaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Given an array of integers, display how many times each element appears.
Input: [1, 2, 2, 3, 1, 4]  
Output:  
1 → 2 times  
2 → 2 times  
3 → 1 time  
4 → 1 time*/


public class Task8 {

	public static List<Integer> solution(int[] arr)
	{
		List<Integer> result = new ArrayList<>();
		List<Integer> nonDuplecateArr = new ArrayList<>();

		for(int i: arr) {
			if(!nonDuplecateArr.contains(i))
				nonDuplecateArr.add(i);
		}
		int count = 0;
		for(int i: nonDuplecateArr)
		{
			count = 0;
			for(int j:arr)
			{
				if(i == j) {
					count++;
				}
			}
			result.add(count);
		}
		
		System.out.println("Count of values:"+nonDuplecateArr);
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println("You can enter 5 values:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		
		System.out.println("Number of times:"+solution(arr));

	}

}
