import java.util.Scanner;
class Array{
    public static void main(String args[]){
        int Value[],Ch,Loc,Newvalue,DeleteValue,i,k;
        Value = new int[11];
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter The 10 Values:");
        for(i=1;i<=10;i++)
            Value[i] = ob.nextInt();
		    System.out.println("Succesfully Stored Value");
        do{
				 System.out.print("\n!\n!\n!\n\n\n!\n1.Update\n2.Delete\n3.Print All\n4.Exit\nEnter Choice:");
				 Ch = ob.nextInt();
         switch(Ch){
            case 1:
				 //Update();
				 System.out.print(":Enter Location To Update:");
				 Loc = ob.nextInt();
				 System.out.print("Update Value:");
				 Newvalue = ob.nextInt();
				 Value[Loc] = Newvalue;
				 System.out.print("Update Value Succusfully");
				break;
            case 2:
			     // Delete();
			     System.out.print(":Enter Location To Xxx Delete xxX:");
			     DeleteValue = ob.nextInt();
			     for(k=DeleteValue;k<=10;k++){
			     if(k!=10) 
			     Value[k] = Value[k+1];
			     else
			     Value[k] = 0;
			     }
			     System.out.print("____Succesfully Deleted____");
			     break;
            case 3:
				 // Print();
				 System.out.println("All Array Values To");
				 for(int j=1;j<=10;j++)
				 System.out.println(Value[j]);
				   break;
            default://Anyone Other Numbers 
				 if(Ch!=4)
				 System.err.println("Invalide Choice");
				 break;
            }
        }while(Ch!=4);
        System.out.print("****End Of System Program****");
		}
	}