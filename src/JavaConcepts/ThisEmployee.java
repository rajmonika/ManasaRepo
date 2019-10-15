package JavaConcepts;

public class ThisEmployee {
	
	int EmpID;
	String EmpName;
	char gender;
	double sal;
	
 
	public ThisEmployee(int EmpID, String EmpName, char gender, double sal)	{
		this.EmpID = EmpID;
		this.EmpName = EmpName;
		this.gender = gender;
		this.sal = sal;
	}
	
	public static void main(String[] args) {

		ThisEmployee e = new ThisEmployee(101, "Steve", 'M', 2689.56);
		System.out.println("EmpID is: "+e.EmpID);
		System.out.println("Emp Name is: "+e.EmpName);
		System.out.println("Gender of Employee is: "+e.gender);
		System.out.println("Salary of the Employee is: "+e.sal);

	}

}
