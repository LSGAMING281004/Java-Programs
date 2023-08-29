import java.util.*;
class ExceptionHandling
{
    //This is InputMismatchException program
    public static void main(String[] args)
    {
        int Numbers[] = new int[5];
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 5 numbers:");
        try {
            for(int i=0;i<5;i++)
                Numbers[i] = obj.nextInt();
        }
        catch(InputMismatchException e) {
            System.out.println("You can only store numbers");
        }
          for(int j=0;j<5;j++)
             System.out.println("You stored numbers is:"+Numbers[j]);
    }
}