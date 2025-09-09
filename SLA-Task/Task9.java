package JavaTask;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int evenNo=0,oddNo=0;
		for(int i : arr)
		{
			if(i%2 == 0) evenNo += i;
			else oddNo += i;
		}
		
		System.out.println("Sum of even:"+evenNo +"  Sum of odd:"+oddNo);
	}

}
