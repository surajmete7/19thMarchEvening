package constructor;

public class Hr_Portal {

	public static void main(String[] args) {
		
		Employee SachinT=new Employee();  //creating object
		
		SachinT.emp_name="Sachin Tendulkar";
		SachinT.emp_id=10;
		SachinT.emp_sal=123.33f;
		SachinT.emp_dept="Batting";
		SachinT.gender='M';
		
		SachinT.emp_info();
		
		
		Employee ZaheerK=new Employee();
		
		ZaheerK.emp_name="Zaheer Khan";
		ZaheerK.emp_id=34;
		ZaheerK.emp_sal=100.12f;
		ZaheerK.emp_dept="Bowling";
		ZaheerK.gender='M';
		
		ZaheerK.emp_info();
		
		Employee Viratk=new Employee();
		
		Viratk.emp_name="Virat Kohli";
		Viratk.emp_id=18;
		Viratk.emp_sal=133.45f;
		Viratk.emp_dept="Batting";
		Viratk.gender='M';
		
		Viratk.emp_info();
		
		

	}

}
