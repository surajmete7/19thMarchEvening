package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
	GrandMother gm=new GrandMother();
	gm.receipe();
	
	mother m=new mother();
	m.receipe(); //calling superclass method using sub class object
	m.nature();  //calling own property
	mother.care(); //calling non static method
	
	child c=new child();
	c.receipe(); //calling supermost class properties using child object
	c.nature();  //calling superclass properties using child object
	c.mobile();  //calling own property
	
	child.stories(); // calling supermost class properties using child class
	child.care();  //calling superclass properties using child class
	child.laptop();  // calling own property
	}

}
