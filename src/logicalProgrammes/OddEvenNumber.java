package logicalProgrammes;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter inter number");
		int a=sc.nextInt();

	
		if (a%2==0)
		{
			System.out.println("Given number is even number");
		}
		else
		{
			System.out.println("Given number is odd number");
		}
	

}
}