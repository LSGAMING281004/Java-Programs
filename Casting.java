package com.dev;

import java.util.ArrayList;

public class Casting {

	public static void main(String[] args) {
		//Data type casting 
		/*Widening casting(Automatic casting) - converting smaller type into larger type size
		 * byte -> short -> char -> int -> long -> float -> double
		 * 
		 * Narrowing casting(manual casting) - converting larger type size into smaller type size 
		 * double -> float -> long -> int -> char -> short -> byte
		 
		 */

		
		int myInt = 9;// integer
		double myDouble = myInt;//automatic casting
		System.out.println("The value of myInt is "+myInt);
		System.out.println("The value of myDouble is "+myDouble);
		
		double myDouble1 = 9.75d;//double value
		int myInt1 = (int) myDouble1;// manual casting - double into integer
		System.out.println("The value of myInt1 is "+myInt1);
		System.out.println("The value of myDouble1 is "+myDouble1);
		
		//Autoboxing: Converting primitive data type objects - creating obj for particular variable
		//It is used to  convert all primitives data type into its corresponding wrapper objects (through class) and vice-versa
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.54F;
		double d = 60.00D;
		
		char c = 'a';
		boolean bool = true;
		
		// Converting
		Byte byteObj = b;
		Short shortObj = s;
		Integer intObj = i;
		Long longObj = l;
		Float floatObj = f;
		Double doubleObj = d;
		
		Character charObj = c;
		Boolean booleanObj = bool;
			
		//Printing object values
		System.out.println("-- Object Values --");
		System.out.println("Byte Object value: "+byteObj);
		System.out.println("Short Object value: "+shortObj);
		System.out.println("Integer Object value: "+intObj);
		System.out.println("Long Object value: "+longObj);
		System.out.println("Float Object value: "+floatObj);
		System.out.println("Double Object value: "+doubleObj);
		System.out.println("Character Object value: "+charObj);
		System.out.println("Boolean Object value: "+booleanObj);

		
		//Converting
		
		byte b1 = byteObj;
		short s1 = shortObj;
		int i1 = intObj;
		long l1 = longObj;
		float f1 = floatObj;
		double d1 = doubleObj;
		
		char c1 = charObj;
		boolean bool1 =booleanObj;
		
		//Printing primitive values
		System.out.println("-- Primitive Values --");
		System.out.println("byte Primitive value: "+b1);
		System.out.println("short Primitive value: "+s1);
		System.out.println("int Primitive value: "+i1);
		System.out.println("long Primitive value: "+l1);
		System.out.println("float Primitive value: "+f1);
		System.out.println("double Primitive value: "+d1);
		System.out.println("char Primitive value: "+c1);
		System.out.println("boolean Primitive value: "+bool1);
		
		ArrayList<Integer> numbers = new ArrayList<>();
        // Autoboxing occurs here: int primitives are converted to Integer objects
        numbers.add(1);
        numbers.add(2);
        numbers.add(24);

        System.out.println("ArrayList values: "+numbers);
		
	}

}
