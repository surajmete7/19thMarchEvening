package logicalProgrammes;

public class FactorialNumber {

	public static void main(String[] args) {
 
		
		//4! ....>4*3*2*1
		
		int num=5;
		int fact=1;
		
		for(int i=num;i>=1;i--)
		{
			fact=i*fact;
			
		}
		System.out.println("Factorial of number is "+fact);
		
		
		
		
		
		
		
		
	}

}
