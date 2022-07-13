package logicalProgrammes;

public class ArnStrongNumber {

	public static void main(String[] args) {

		//123...>1^3+2^3+3^3=1+8+27=36
		//153...>1^3+5^3+3^3=1+125+27=153
		
		int orgNum=153;
		int armNum=0;
		
		for(int i=orgNum;i>0;i=i/10)
		{
			int rem = i%10;
			armNum=armNum+(rem*rem*rem);
				
		}
		if(orgNum==armNum)
		{
			System.out.println("Given Number  "+orgNum+ " is ArmStrong number");
		}
		else
		{
			System.out.println("Given number is not armstrong number");
		}
	}

}
