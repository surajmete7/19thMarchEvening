package logicalProgrammes;

public class primeNumber {

	public static void main(String[] args) {
 
		int num=11;
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Given number is not aprime number");
		}
		else {
			System.out.println("Given number is a prime number");
		}
		
		
		
	}

}
