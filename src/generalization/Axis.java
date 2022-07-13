package generalization;

public class Axis implements RBI
{

	@Override
	public void savingAccount() 
	{
		System.out.println("Axis FD interest rate is 7%");

	}

	@Override
	public void FD() 
	{
		System.out.println("Axis FD acc interest rate is 8%");

	}

	@Override
	public void loan() 
	{
		System.out.println(" loan acc interest rate is 9%");
	}

	public void cashDepositMoney()
	{
		System.out.println("This is Axis bank cash deposit machine");
	}

}
