package logicalProgrammes;

public class ReverseNumberWithoutString {

	public static void main(String[] args) {

		//123..>321
		
//		System.out.println(123%10);
//		System.out.println(12%10);
//		System.out.println(1%10);
		
		int num=123;
		int revNum=0;
		for(int i=num; i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10+rem;
	   }
		System.out.println("Reverse number is "+revNum);
		
		
		
	}

}
