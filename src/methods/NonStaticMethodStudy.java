package methods;

public class NonStaticMethodStudy {

	public static void main(String[] args) {
		
        //className objectName= new className();
		// to non static method..> objectName.methodName();
		NonStaticMethodStudy obj= new NonStaticMethodStudy();
		obj.display();  //calling non static method from same class using project
		
	}
public void display()
{
	System.out.println("Hi this is non static Display method");
}
}
