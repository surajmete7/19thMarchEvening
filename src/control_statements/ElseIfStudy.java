package control_statements;

public class ElseIfStudy {

	public static void main(String[] args) {

		//if yours marks >=66...>You are in Distinction
		//elseif marks >=60 & <66 you are in First class
		//elseif marks >=50 & <60 you are in second class
		//elseif marks >=40 & <50 you are just pass
		//else marks >40 you are fail
		int marks=55;
		if(marks >=66)
		{
			System.out.println("You are in Distintion");
		}
		else if(marks>=60 & marks<66)
		{
			System.out.println("you are in First class");
		}
		else if(marks>=50 & marks<60) 
		{
			System.out.println("You are in Second class");

		}
		else if(marks>=40 & marks<50)
		{
			System.out.println("You are just pass");
		}
		else
		{
			System.out.println("You are fail");
		}
	}
	
}
