package pattern;

public class Eg12 {

	public static void main(String[] args) {

		
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
		
		//row..>9  column...>5
		
		int star=1;
		int space=4;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<=4)
			{
				star++;
			}
			else {
				star--;
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
