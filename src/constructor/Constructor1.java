package constructor;

public class Constructor1 {

	int a;
	int b;   //variable declaration
	
	public Constructor1()//constructor without parameter
	{
		a=100;  // variable initialization
		b=200;
	}
	public Constructor1(int x) //constructor with single parameter
	{
		a=x;
	}
	public Constructor1(int x, int y) //constructor with double parameter
	{
		a=x;
		b=y;
		
	}
	public static void main(String[] args) 
	{
		Constructor1 C1= new Constructor1();
		C1.addition();
		Constructor1 C2= new Constructor1(300);
		C2.addition();
		Constructor1 C3 = new Constructor1(400, 500);
		C3.addition();
				
	}
	public void addition() 
	{
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
}
