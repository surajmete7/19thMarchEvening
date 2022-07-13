package constructor;

public class Employee {

	//name, id, sal, dept, gender
	
	String emp_name;
	int emp_id;
	float emp_sal;
	String emp_dept;
	char gender;
	
	public void emp_info()
	{
		System.out.println("========================");
		System.out.println("employee name is "+emp_name);
		System.out.println("employee id is "+emp_id);
		System.out.println("employee salary is "+emp_sal);
		System.out.println("employee dept is "+emp_dept);
		System.out.println("employee gender is "+gender);
	}
}
