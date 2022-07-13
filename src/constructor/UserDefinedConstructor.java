package constructor;

public class UserDefinedConstructor {

	public UserDefinedConstructor() //user defined/ zero parameter constructor
	{ 
		System.out.println("I am user defined constructor");
		int a=10;
		int b=20;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
	
	public static void main(String[] args) 
	{
		UserDefinedConstructor ud= new UserDefinedConstructor();
		ud.test();

	}
public void test() 
{
	System.out.println("Hi i am test method");
}
}
