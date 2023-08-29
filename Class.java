import java.util.*;
class Class
{
	public static void main(String[] args)
	{
		int Age;
		boolean Vote;
		Checking check = new Checking();
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter your age:");
		Age = ob.nextInt();
		Vote = check.age(Age);
		if(Vote==true)
			System.out.println("Your Eligible for Vote");
		else
			System.out.println("Your Not Eligible for Vote");
		
	}
}
class Checking
{
	boolean age(int Age)
	{
		boolean vote=false;
		if(17<Age)
			vote=true;
        return vote;		
	}
}