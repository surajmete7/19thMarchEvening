package variable_types;

public class GlobalVariable {

	int a=10;          //global non static variable
	static int b=90;  //global static variable

	public static void main(String[] args) {
		
		GlobalVariable gv=new GlobalVariable(); // create object in same class
		gv.test();  // calling non static method
		test1();   // calling static method
		System.out.println("Value of a is "+gv.a);  //calling non static global variable...>objectname.variablename
		System.out.println("Value of b is "+b);   // calling static global variable from same class....>variable name
	
		//calling non static global variable from another class
		Sample s=new Sample();  //created object from another class
		System.out.println("Non static global variable from another class is "+s.p);
		
		//calling static global variable from another class
		System.out.println("static global variable from another class is "+Sample.q);
		
		int sub=800-gv.a;   // using non static global variable from same class
		int sub1=900-b;     //using static global variable from same class
		
		int sub2=1000-s.p;  //using non static global variable from another class
		int sub3=3000-Sample.q; //using static global variable from another class
		
		System.out.println(sub);
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);

	}
public void test() //non static method
{
	int sum=a+10;  //we can non static global variable
	int sub=b-10;   //we can call static global variable
	System.out.println(sum);
	System.out.println(sub);
}
public static void test1()  //static method
{
	// int sum=a+10;  //we can't call non static global variable in static method
	int sub=b-10;    //we can call static global variable
	System.out.println(sub);
}
}
