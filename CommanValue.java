import java.util.ArrayList;
import java.util.List;

public class CommanValue
{
    //Pattern
    public void pattern()
    {
        String str = "";
        for(int i=1;i<=5;i++)
        {
            System.out.print(str);
            for(int j=i;j<=5;j++)
            {
                System.out.print(" "+j);  
            }
            str += " ";
            System.out.println();
        }
    }
    //Given two arrays, find their intersection (common elements). Without using predefined methods
    public void solution(int[] array1, int[] array2)
    {
        List<Integer> list = new ArrayList<>();
        for(int i:array1)
        {
            for(int j:array2)
            {
                if(i==j)
                    list.add(i);
            }
        }
        System.out.println(list);
    }
    public static void main(String args[])
    {
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {3,4,5,6};

        CommanValue commanValue = new CommanValue();

        //commanValue.solution(arr1, arr2);
        commanValue.pattern();
    }
}