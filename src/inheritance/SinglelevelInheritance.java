package inheritance;

public class SinglelevelInheritance {

	public static void main(String[] args) 
	{
	// to call mothers non static property i need to create object
	mother m= new mother();  //created object of mother class
	// to call child non static property i need to create object
	child c= new child();  //created object for child class
	m.nature(); //calling mothers property
	mother.care();//calling mothers property
	
	c.nature(); //using child object we are calling mothers property
	child.care();  //using child class calling mothers static property
	child.laptop();
	c.mobile();
	}

}
