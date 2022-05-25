package inheritance;

public class Employee extends Person_{
	
	public String empUserName;
	protected int empId;
	protected String designation;
	protected int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empUserName) {
		super();
		this.empUserName = empUserName;
	}

	public Employee(int empId,String name,int age ,String designation, int salary) {
		super(name,age);
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", designation=" + designation + ", salary=" + salary + ", name=" + name
				+ ", age=" + age + "]";
	}
	public void personDetails(int height,float weight,String emailId)
	{
		System.out.println("Height of the employee:"+height);
		System.out.println("Weight of the employee:"+weight);
		System.out.println("Email Id of the employee:"+emailId);
	}
	public void nativePlace(String place)
	{
		super.nativePlace(place);
		System.out.println(" Employee Native Place:"+place);
	}
}
