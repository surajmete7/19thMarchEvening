package logicalProgrammes;

public class ReverseOddOrEvenString {

	public static void main(String[] args) {
 
		String a="I LOVE MY INDIA";
		
		// Even place reverse
		
		String[] ar = a.split("  ");
		
		//ar[]={"I", "LOVE" , "MY", "INDIA"}
		//           1        2            3            4
		
		for(int i=0;i<=ar.length-1;i++)
		{
			if(i%2!=0)
			{
				String s = ar[i];
				ar[i]=reverse(s);
			}
			
		}
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}
	private static String reverse(String s) {
		// TODO Auto-generated method stub
		return null;
	}
	public static  String rev (String inp)
	{
		String rev=" ";
		for(int i=inp.length()-1;i>=0;i--)
		{
			rev=rev+inp.charAt(i);
		}
		return rev;
	}

}
