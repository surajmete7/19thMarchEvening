package methods;

public class MathOperation {

	public static void main(String[] args) 
	{
MathOperation mo= new MathOperation(); //  object created
mo.add(); // calling non static method from same class
mo.sub(); //calling non static method from same class
Sample.mul(); // calling static method from another class
Sample s= new Sample(); //created object of another class
s. div(); // calling non static method from another class
	}
public void add() // without parameter
{
	int a; //variable declaration
	int b;
	int addition;
	a=100;
	b=200;
	addition=a+b;
	System.out.println("Addition is "+addition);
}
public  void sub() 
{
	int a=100; // 1+2 variable declaration +assign value
	int b=50;
	int sub=a-b;
	System.out.println("Substraction is "+sub);
}
}

