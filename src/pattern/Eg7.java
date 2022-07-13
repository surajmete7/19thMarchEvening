package pattern;

public class Eg7 {

	public static void main(String[] args) {

//		*******
//		  *****
//		    ***
//		      *
		
		//row..>4  column..>7
		
		int space=0;
		int star=7;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star=star-2;
			space++;
			System.out.println();

		}
		
		
		
		
		
	}

}
