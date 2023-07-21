import java.util.Scanner;
public class big
{
    public static void main(String args[])
    {
        int n[],max,s,j;
        n=new int[10];
        Scanner sc= new Scanner(System.in); 
		System.out.print("Enter the number:");
        for(s=0;s<10;s++)
        {
            n[s]= sc.nextInt();
        }
		
		
		
        max=n[0];
        for(j=1;j<10;j++)
        {
            if(n[j]>max)
            {
                max=n[j];
            }
        }
        System.out.print("Big"+max);
    }
}