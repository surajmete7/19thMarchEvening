package methods;

public class UnivercityResult {

	public static void main(String[] args) {
	
UnivercityResult ur= new UnivercityResult();
ur.studentInfo(); // calling method without parameter
ur.Studentinfo1("suraj", 110, 'B', 123.23d); // calling method with parameters
ur.Studentinfo1("Ajay", 120, 'A', 145.47);  //calling method with parameters
	}
public void studentInfo()  // method without parameter 
{
	//name, rollNum, grade, totalMarks
	String studentName="suraj"; //1+2 declaration+ assign
	int rollNum= 110;
	char grade='A';
	float totalMarks=83.09f;
	System.out.println("===================================");
	System.out.println("Student name is "+studentName);
	System.out.println("Student rollNum is "+rollNum);
	System.out.println("Student grade is "+grade);
	System.out.println("Student's marks are "+totalMarks);
	System.out.println("===================================");
}
//name, rollNum, grade, totalMarks
//method with parameters
public void Studentinfo1(String studentName, int rollNum, char grade, double totalMarks) 
{
	System.out.println("===================================");
	System.out.println("Student name is "+studentName);
	System.out.println("Student rollNum is "+rollNum);
	System.out.println("Student grade is "+grade);
	System.out.println("Student's marks are "+totalMarks);
	System.out.println("===================================");
}
}
