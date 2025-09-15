package com.dev;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static File myObj = new File("StudentInfo.txt");

	public static void createFile() {
	    try {
	        //File myObj = new File("StudentInfo.txt"); // Create File object
	        if (myObj.createNewFile()) {           // Try to create the file
	          System.out.println("File created: " + myObj.getName());
	        } else {
	          System.out.println("File already exists.");
	        }
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace(); // Print error details
	      }
	}
	
	public static void writeFile() {
		try {
			FileWriter writer = new FileWriter("StudentInfo.txt");
			writer.write("Hello, File Handling in Java!");
			writer.close();
			System.out.println("Successfully written to the file.");
			} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			}
	}
	
	public static void readFile() {
		try {
			//File file = new File("StudentInfo.txt");
			Scanner reader = new Scanner(myObj);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
                String[] words = line.split("\\s+"); // Split by whitespace
         
                for (String word : words) {
                		if(word=="Hello,")
                			System.out.println(word);
                }
				//System.out.println(reader.nextLine());
			}
			reader.close();
			} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			e.printStackTrace();
			}
	}
	
	public static void deleteFile() {
		try {
			//File myObj = new File("filename.txt"); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    } 
		}catch(Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		//createFile();
		//writeFile();
		readFile();
		//deleteFile();
	}

}
