package arryays;

public class FloatArray {

	public static void main(String[] args) 
	{
		float percentage[]=new float[4];
		
		percentage[0]=83.09f;
		percentage[1]=85.04f;
		percentage[2]=77.45f;
		percentage[3]=56.99f;
		
		System.out.println(percentage[0]);
		System.out.println(percentage[1]);
		System.out.println(percentage[2]);
		System.out.println(percentage[3]);
		System.out.println("===================");
		
		for(int i=0;i<=percentage.length-1;i++)
		{
			System.out.println(percentage[i]);
		}
		System.out.println("========================");
		
		for(int i=percentage.length-1;i>=0;i--)
		{
			System.out.println(percentage[i]);
		}

	}

}
