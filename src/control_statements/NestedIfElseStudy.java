package control_statements;

public class NestedIfElseStudy {

	public static void main(String[] args) {
		int pin=1497;
		int amt=2500;
		if(pin==1496) 
		{
			System.out.println("Plz Enter Amount");
			if (amt==2500)
			{
			System.out.println("Transaction Sucessful");	
			}
			else {
				System.out.println("plz Enter valid Amount");
			}
			}
			else {
				System.out.println("Plz Enter Valid PIn");
			}
	}
}

