package arryays;

public class IntegerArray {

	public static void main(String[] args) 
	{
		int rollNum[]=new int[4];
		rollNum[0]=15;
		rollNum[1]=18;
		rollNum[2]=12;
		rollNum[3]=25;
		
		System.out.println(rollNum[0]);
		System.out.println(rollNum[1]);
		System.out.println(rollNum[2]);
		System.out.println(rollNum[3]);
		System.out.println("============");
		
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("===============");
		
		for(int i=rollNum.length-1;i>=0;i--)
		{
			System.out.println(rollNum[i]);
		}
		

	}

}
