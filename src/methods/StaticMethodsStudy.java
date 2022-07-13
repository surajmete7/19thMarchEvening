package methods;

public class StaticMethodsStudy {

	public static void main(String[] args) {

		myMethod(); //calling static regular method from same class
		method1();  //calling static regular method from same class
	Testing.display(); // calling static regular method from different class
	Testing.calculation(); // calling static regular method from different class
	}

	
	public static void myMethod()
	{
		System.out.println("HI THIS IS MYMETHOD");
	}
	public static void method1()
	{
		System.out.println("HI THIS IS METHOD1");
	}
}
