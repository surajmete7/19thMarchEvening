package casting;

public class UpCasting {

	public static void main(String[] args) 
	{
		Father f=new Father();
		Son s=new Son();
		
		f.car();
		f.bike();
		s.car();
		s.bike();
		s.education();
		
		Father f1=new Son();
		f1.bike();
		f1.car();
	}

}
