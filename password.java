import java.util.Scanner;
public class password
{
	public static void main(String[] args)
	{
		int password;
		Scanner obj = new Scanner(System.in);
		System.out.print("User name:");
		String username = obj.nextLine();
		goto x;
		System.out.print("Enter the new_password:");
		int new_password = obj.nextInt();
		System.out.print("conform password:");
		int conformpassword = obj.nextInt();
		x;
		if(new_password==conformpassword)
		{
			password=conformpassword;
			System.out.println("*******************WELLCOME THE LS WEB WORLD*************");
			System.out.print("Wellcome"+username);
			System.out.println("Login ID");
			System.out.print("Enter Username:");
			String newusername=obj.nextLine();
			if(username==newusername)
			{
				System.out.print("Enter the password:");
				int passwordnew=obj.nextInt();
				if(password==passwordnew)
				{
					System.out.println("THANK YOU so much");
				}
				else{
					System.out.println("worrng password");
				}
			}
			else{
				System.out.print("NOT FOUND user");
			}
			
			
		}
		else
		{
			System.out.print("Not mach password");
			
		}
		
		
	}
}