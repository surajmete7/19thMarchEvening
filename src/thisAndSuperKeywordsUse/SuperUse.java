package thisAndSuperKeywordsUse;

public class SuperUse extends ThisUse {
	
	
	int a=200;  //declaring non static global variable
	
	public static void main(String[] args) 
	{
	SuperUse su=new SuperUse();
	su.sub();
	}
	public void sub()
	{
		int a=800;
		int sub=a-70;  ///using local variable
		System.out.println("Substraction is "+sub);
		
		int sub1=this.a-70;  //using global variable value from same class
		System.out.println("Substraction is "+sub1);
		
		int sub2=super.a-70;  //using global value from super class
		System.out.println("Substraction is "+sub2);
	}

}
