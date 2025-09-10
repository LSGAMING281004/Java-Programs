package com.dev;

public class MultiArray {
/*
 * Jagged array is an array of array where each row can have a different length it is also called a ragged array
 * */
	public static void main(String[] args) {
		
		int[][] jag = new int[3][];
		
		jag[0] = new int[] {1,2,3};
		jag[1] = new int[] {4,5};
		jag[2] = new int[] {6,7,8};
		
		for(int i=0; i<jag.length; i++){
			for(int j=0; j<jag[i].length; j++){
				System.out.print(jag[i][j]+" ");
			}
				System.out.println();
		}	
		System.out.println("\n----------------------------\n");
		
		//Sum of 2 matrix 
		int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
		int b[][] = {{4,5,7},{8,9,10},{5,3,4}};
		
		int c[][] = new int[3][3];
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
