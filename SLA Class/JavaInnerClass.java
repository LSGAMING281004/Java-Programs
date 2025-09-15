package com.dev;

/* To access the inner class, create an object of the outer class, and then create an object of the inner class; */

class OuterClass {
	int x = 10;
	public class InnerClass {
		int y = 20;
	}// -- InnerClass closes here
	
}// --Outer class closes here
public class JavaInnerClass {

	public static void main(String[] args) {
		OuterClass outerclass = new OuterClass();
		OuterClass.InnerClass innerclass = outerclass.new InnerClass(); 
		innerclass.y = 9;//override
		System.out.println(innerclass.y);
	}

}
