package logicalProgrammes;


public class ReverseNumber {

	public static void main(String[] args) {

		int num=123;
		
		String strNum = Integer.toString(num);
		
		String rev="";
		
		for(int i=strNum.length()-1;i>=0;i--)
		{
			rev=rev+strNum.charAt(i);
		}
		
		int revNum = Integer.parseInt(rev);
		System.out.println("Original number is "+num);
		System.out.println("reverse number is "+revNum);
		
		
		
		
		
		
	}

}
