package interfaceStudy;

public interface Mother 
{

	void receipe();
	void care();
	default void money()
	{
		System.out.println("Mothers money");
	}
	static void test()
	{
		System.out.println("Mothers test");
	}
}
