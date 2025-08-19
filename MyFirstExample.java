package com.dev;

import java.util.Scanner;

public class MyFirstExample {

    public static void main(String args[]) {
        float num1, num2, ans = 0;
        String op;

        try {
            Scanner obj = new Scanner(System.in);

            // Sum of float values 
            //Arithmetic Operations using switch
            System.out.println("Enter number 1: ");
            num1 = obj.nextFloat();
            System.out.println("Enter number 2: ");
            num2 = obj.nextFloat();
            obj.nextLine();
            System.out.println("Enter Operator Example(+,-,*,/,%) choose any one: ");

            op = obj.nextLine();
            
            switch(op)
            {
            case "+":
            	ans = num1+num2;
            	break;
            	
            case "-":
            	ans = num1-num2;
            	break;
            	
            case "*":
            	ans = num1*num2;
            	break;
            	
            case "/":
            	ans = num1/num2;
            	break;
            	
            case "%":
            	ans = num1%num2;
            	break;
            
            default:
            	System.out.println("Invalid Operator");
            	
            }
            
            System.out.println("Answer is: "+ans);
            
           
            // Relational Operator
            
            
            
            
            // Double data type
            System.out.println("Enter your double value:");
            double d_val = obj.nextDouble();
            System.out.println("Your value: " + d_val);
            obj.close();
            
            
            

        } catch (Exception e) {
            System.out.println("Value invalid: " + e.getMessage());
        }
    }
}
