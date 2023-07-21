import java.util.Scanner;
public class linear
{
    public static void main(String args[])
    {
        int n[],j,t,i;
        Scanner ob= new Scanner(System.in);
        n=new int[10];
        System.out.print("Enter 10 values in array:");

        for(i=0;i<10;i++)
        {
            n[i]=ob.nextInt();
        }
        System.out.print("Enter the search value:");

        t=ob.nextInt();
        for(j=0;j<5;j++)
        {
            if(n[j]==t)
            {
                System.out.print("You searched value is located in array:" +j);
            }
        }
    }
}