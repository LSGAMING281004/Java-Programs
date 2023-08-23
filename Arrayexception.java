import java.util.Scanner;
public class Arrayexception{ 
     public static void main(String args[]){
       String name[]; //String data type
       int count,loop;
       Scanner obj = new Scanner(System.in);      
        try{
            name = new String[4];  //Only store 3 names
            System.out.println("Enter the 3 names only");
            System.out.print("Enter how many names:");
            count = obj.nextInt();
             System.out.println("Enter name");
            for(loop=0;loop<=count;loop++)
                 name[loop] = obj.nextLine();
         }
        catch(ArrayIndexOutOfBoundsException e){
             System.err.println("Sorry,3 names only store");
        }
         System.out.print("Thank you");
    }
}