package inheritance;

public class HierachicalInhertance {

	public static void main(String[] args) 
	{
		Father f=new Father();
		
		Son s=new Son();
		
		Daughters d=new Daughters();
		
	f.emotions();
	
	s.emotions();
	s.bike();
	
	d.emotions();
	d.scooty();
		
				
	}

}
