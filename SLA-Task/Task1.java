package com.dev;

import java.util.Scanner;

public class Task1 {

	
	public static void main(String[] args) {
		
		//Reads a numeric string from the user (via String). Converts it to an int, long, float, and double
		

		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.print("Enter a numeric value:");
		String numeric = scan.nextLine();
		
		
		int myInt = Integer.parseInt(numeric);
		float myFloat = Float.parseFloat(numeric);
		double myDouble = Double.parseDouble(numeric);
		
		System.out.println("Integer value: "+myInt);
		System.out.println("Float value: "+myFloat);
		System.out.println("Double value: "+myDouble);
		}
		catch(Exception e) {
			System.out.println("Not a numeric value "+e);
		}
		
		
		
		// Write methods converting between Celsius, Fahrenheit, Kelvin using double
	   
	        double c = 25;
	        double f = 77;
	        double k = 298.15;

	        System.out.println("\nTemperature\n"+c+" C to F: " + celsiusToFahrenheit(c));
	        System.out.println(c+" C to K: " + celsiusToKelvin(c));
	        System.out.println(f+" F to C: " + fahrenheitToCelsius(f));
	        System.out.println(f+" F to K: " + fahrenheitToKelvin(f));
	        System.out.println(k+" K to C: " + kelvinToCelsius(k));
	        System.out.println(k+" K to F: " + kelvinToFahrenheit(k));

	}
	// Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

}
