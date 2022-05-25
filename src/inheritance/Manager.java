package inheritance;

public class Manager extends Employee{

	private String department;
	private String projectName;
	protected String companyName;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int empId,String name,int age ,String designation, int salary,String department, String projectName, String companyName) {
		super(empId,name,age,designation,salary);
		this.department = department;
		this.projectName = projectName;
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Manager [department=" + department + ", projectName=" + projectName + ", companyName=" + companyName
				+ ", empId=" + empId + ", salary=" + salary + "]";
	}
	public void nativePlace(String place)
	{
		super.nativePlace(place);
		System.out.println(" Manager Native Place:"+place);
	}
	
}
