import java.util.Scanner;
public class NameSpace
{
	public static void main(String[] args)
	{
		int Score=0,i,j,k,l;
		boolean flag = false;	
		Scanner ob = new Scanner(System.in);
		String str = ob.nextLine();

		char[] Name=new char[str.length()];
		for (int o = 0; o < str.length(); o++) {
            Name[o] = str.charAt(o);
        }

		System.out.print(Name[0]);
		for(i=0;i<Name.length;i++)
		{
			if(Name[i]==' ')
			{
				flag = true;
				System.out.print("."+Name[i+1]);
			}
		} 
		for(j=i-1;j>0;j--)
		{
			++Score;
			if(Name[j]==' ')
			break;
		}
		if(flag == true)
		{
			for(k= i-Score;k<i-2;k++)
			System.out.print(Name[k+2]);
		}
	   else
		  for(l=1;l<Name.length;l++)
		  System.out.print(Name[l]);
	}
}