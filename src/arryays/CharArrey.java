package arryays;

public class CharArrey {

	public static void main(String[] args) 
	{
		//1. array declaration
		char grade[]=new char[5];
		
		//2. assign value
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		
		for(int i=0;i<=grade.length-1;i++)
		{
			System.out.println(grade[i]);
		}

	}

}
