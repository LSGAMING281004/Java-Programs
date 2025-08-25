package JavaTest;

import java.util.Scanner;

public class Test1 {
	Scanner scan = new Scanner(System.in);
	
	//1.Grading System
	public void gradingSystem()
	{
		System.out.println("Enter mark: ");
		int mark = scan.nextInt();
		if(mark <=100 && mark >=90)
			System.out.println("A grad");
		else if(mark <= 89 && mark >=80)
			System.out.println("B grad");
		else if(mark <= 79 && mark >=70)
			System.out.println("C grad");
		else if(mark <= 69 && mark >=60)
			System.out.println("D grad");
		else if(mark < 60)
			System.out.println("Fail");
		else
			System.out.println("Your mark is invalid");
	}
	
	//2.Print Menu Until Exit
	public void gameOption()
	{
		String input;
		do{
			System.out.println("--- Game Over ---\nPress 1: Exit Game \t Except 1: Restart Game \n Enter your option:");
			input = scan.nextLine();
			if(input.equals("1"))
				break;
		}while(input != "1");
		System.out.println("Game End");
	}
	
	//3.At Least Once Execution
	public void squares()
	{
		int num;
		do {
		System.out.println("Enter the squares number:  OR   Are you want to exit:0");
		num = scan.nextInt();
		System.out.println("Square: "+num*num);
		}while(num != 0);
		System.out.print("Program end");
	}
	
	// 4.Check Character Type
	void characterType()
	{
		  System.out.print("Enter a character: ");
	        char ch = scan.next().charAt(0);

	        if (Character.isLetter(ch)) {
	            System.out.println("It's an alphabet.");
	        } else if (Character.isDigit(ch)) {
	            System.out.println("It's a digit.");
	        } else {
	            System.out.println("It's a special character.");
	        }
		
		
	}

	// 5.Electricity Bill Calculator
	public void electricityBill()
	{
		System.out.println("Enter units consumed:");
		int unit = scan.nextInt();
		
		if(unit <= 100 && unit >0)
			System.out.println("Amount: "+unit*1.5);
		else if(unit > 100 && unit <=200)
			System.out.println("Amount: "+unit*2.5);
		else if(unit > 200)
			System.out.println("Amount: "+unit*4);
		else 
			System.out.println("Unit value invalid, go to your EP office");
	}
	
	//6.Multiplication Table
	public void multiplicationTable()
	{
		System.out.print("Enter table: ");
		int table = scan.nextInt();
		for(int i=1; i<=10;i++)
			System.out.println(i+" X "+table+" = "+i*table);
	}
	
	//7.Count Vowels in a String
	public void vowelsCount()
	{
		System.out.println("Enter your name:");
		String name = scan.nextLine();
		int vowcount = 0;
		for(int i=0; i<name.length();i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u' || name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O' || name.charAt(i)=='U')
				vowcount++;
		}
		System.out.println("Your name: "+name+"\n Number of vowels in your name: "+vowcount+"\nNumber of constants in your name: "+(name.length()-vowcount));
	}
	
	//8.ATM Menu
	public void atmMenu()
	{
		int menu;
		
		do {
			System.out.println("Enter option:\n1:check balance\n2:Deposit\n3:Withdraw\n4:Exit");
			menu = scan.nextInt();
			
			switch(menu)
			{
				case 1:
					System.out.println("Account Balance: Rs. 9,86,2570");
					break;
				case 2:
					System.out.println("Deposit money");
					break;
				case 3:
					System.out.println("Withdraw money");
					break;
				case 4:
					System.out.println("Thank You");
					break;
				default:
					System.out.println("Invalid option");
			}
			
		}while(menu != 4);
	}
	
	// 9.Check Perfect Number
	void perfectNumber() {
	System.out.print("Enter a number: ");
    int num = scan.nextInt();

    int sum = 0;
    // Find divisors and sum them
    for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0) 
            sum += i;   
    }
    // Check if sum equals the number
    if (sum == num)
        System.out.println(num + " is a Perfect Number.");
    else 
        System.out.println(num + " is NOT a Perfect Number.");
	}
	
	// 10 Feature of Java8
	/*Java 8 Features
	-Lambda Expressions
	-Functional Interfaces
	-Method Reference
	-Streams
	-Comparable and Comparator
	-Optional Class
	-Date/Time API*/
	
	// Main method
	public static void main(String[] args) {
		
		Test1 test = new Test1();
		
		int choice;
		do {
			System.out.println("--- Enter your choice --- \n 1: Grading System \n 2: Game Option \n 3: Squares \n 4: ElectricityBill \n "
					+ "5: Multiplication Table \n 6: Vowels Count \n 7: ATM menu \n 8: Character Type \n 9: perfectNumber \n 10: Exit \n Enter your choice here:");
			choice = test.scan.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Grading mark system");
				test.gradingSystem();
				break;
			case 2:
				System.out.println("Game option");
				test.gameOption();
				break;
			case 3:
				System.out.println("Square of a number");
				test.squares();
				break;
			case 4:
				System.out.println("Electricity bill amount");
				test.electricityBill();
				break;
			case 5:
				System.out.println("Multiplication table");
				test.multiplicationTable();
				break;
			case 6:
				System.out.println("Count vowels");
				test.vowelsCount();
				break;
			case 7:
				System.out.println("ATM menu option");
				test.atmMenu();
				break;
			case 8:
				System.out.println("Check character type");
				test.characterType();
				break;
			case 9:
				System.out.println("Perfect number program");
				test.perfectNumber();
				break;
			case 10:
				System.out.println("-------------------Exit--------------------");
				break;
			default:
				System.out.println("Invalid choice try again");
			}
		}while(choice != 10);
		
		test.scan.close();
	}
  
}
