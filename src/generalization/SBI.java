package generalization;

public class SBI implements RBI
{

	@Override
	public void savingAccount() 
	{
		System.out.println("sbi saving acc interest rate  is 7%");
		
	}

	@Override
	public void FD() 
	{
		System.out.println("sbi FD interest rate is 10%");
	}

	@Override
	public void loan() 
	{
		System.out.println("sbi loan acc interest rate is 12%");
	}
	public void yono()
	{
		System.out.println("This is sbi yono app");
	}

}
