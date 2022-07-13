package control_statements;

public class SwitchStatement {

	public static void maingenerated(String[] args) {

		//Year 1...> Welcome to 1st year engineering
		//Year 2...> Welcome to 2nd year engineering
		//Year 3...> Welcome to 3rd year Engineering
		//Year 4...> Welcome to 4th year Engineering
		//Year Default...> Please enter year between 1-4
		
		int year=2;
		switch(year)
		{
		case 1:System.out.println("Welcome to 1st year engineering");
		break;
		case 2:System.out.println("Welcome to 2nd year engineering");
		break;
		case 3:System.out.println(" Welcome to 3rd year Engineering");
		break;
		case 4:System.out.println("Welcome to 4th year Engineering");
		break;
		default :System.out.println(" Please enter year between 1-4");
		break;
		
		
		
		
		}
	}

}
