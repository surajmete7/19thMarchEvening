package pattern;

public class Eg2 {

	public static void main(String[] args) {

//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
 
		//row..>5  columns...>5
		
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)  // inner for loop for columns
			{
				System.out.print("* ");
			}
			System.out.println();	
		}
	

	}

}
