package interfaceStudy;

public class Son implements Father, Mother 
{

	public static void main(String[] args) 
{
		Son s=new Son();  // created object of son class
		s.receipe();
		s.care();
		s.love();
		s.nature();
		s.money();
		Father.test();  // calling static method from father interface
		Mother.test();  // calling static method from mother interface
}

	@Override
	public void receipe() 
	{
		System.out.println("Mothers receipe completed in sons class");
	}

	@Override
	public void care() 
	{
		System.out.println("Mothers care completed in sons clss");
	}

	@Override
	public void love() 
	{
		System.out.println("Fathers love completed in sons clss");
	}

	@Override
	public void nature() 
	{
		System.out.println("Fathers nature completed in sons clss");
	}

	@Override
	public void money() 
	{
		Father.super.money();
		Mother.super.money();
	}

}
