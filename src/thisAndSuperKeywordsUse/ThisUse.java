package thisAndSuperKeywordsUse;

public class ThisUse {
	
	int a=100; // non static global variable
	public static void main(String[] args) 
	{
		ThisUse tu=new ThisUse();
		tu.Addition();
	}
	public void Addition()
	{
		int a=10;  //local variable
		int sum=a+900;  // a value will be referred as local value '10'
		System.out.println("Addition is "+sum);
		
		int sum1=this.a+900;  //calling global variable value by using 'this' keywords
		System.out.println("Addition is "+sum1);
	}

}
