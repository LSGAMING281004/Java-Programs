package com.dev;

import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		// Exception handling machanism to handle runtime error it uses try catch blocks to handle exceptions.
		// Try block that contains code that might throw an exception
		// Catch block that handles the exception
		Scanner scan = new Scanner(System.in);
		Exception ex = null;
		try
		{
			int[] arr = {1,2,3};
			arr[3] = 77;
			
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			ex = e;
			 
		}
		
		catch(InputMismatchException l){
			System.out.println(ex);
		}
		
		System.out.println(ex);
		
		try {
			File file = new File("C:\\Users\\Lokesh\\Documents\\Store Information Management System.txt");
			FileReader fr = new FileReader(file);
			System.out.println("File exist");
			fr.close();
			System.out.println(fr);
			
		}catch(Exception e)
		{
			System.out.print("File not exit");
		}
		
		scan.close();
		
	}

}
