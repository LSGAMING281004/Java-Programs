public class NameSpace
{
	public static void main(String[] args)
	{
		int Score=0,i,j,k,l;
		boolean flag = false;
		char Name[] = {'H','i',' ','H','e','l','l','o',' ','W','o','r','l','d'};
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