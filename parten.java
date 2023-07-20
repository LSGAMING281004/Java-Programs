public class parten
{
    public static void main(String args[])
    {
        char ch[]={'A','B','C','D','E','F'};

        
        int i,j,k,t=6,s=5,x,z=1;
        for(k=0;k<=6;k++)
        {

              for(i=0;i<t;i++)
              {
                 System.out.print(ch[i]);
              }
              for(x=0;x<z;x++)
              {
                    if(k==0)
                     System.out.print("G");
                    else
                     System.out.print(" ");
                     
              }
             for(j=s;j>=0;j--)
             {
                 System.out.print(ch[j]);
             }
             
         System.out.println();
         if(k!=0){
         t--;
         s--;
         z=z+2;
         }
         

       }
    }
    
}