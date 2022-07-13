package abstractClass;

public class CC extends AbstractStudy {

	public static void main(String[] args) 
	{
		CC c=new CC(); // created object of concrete class
		c.test();
		c.test1();
		c.test2();
		c.sample();
	}

	@Override
	public void test() 
	{
		System.out.println("This method is completed in CC class");
	}
	public void sample()
	{
		System.out.println("This is own method of cc");
	}
}
