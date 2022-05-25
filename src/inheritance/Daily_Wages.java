package inheritance;

public class Daily_Wages extends Employee{
	
	private int no_of_hours;

	public Daily_Wages() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Daily_Wages(int empId,String name,int age ,String designation, int salary,int no_of_hours) {
		super(empId,name,age,designation,salary);
		this.no_of_hours = no_of_hours;
	}

	@Override
	public String toString() {
		return "Daily_Wages [no_of_hours=" + no_of_hours + ", empId=" + empId + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}
	public void calculateWages() {
		// TODO Auto-generated method stub
		System.out.println("Daily Wages of "+name+" :"+(salary*no_of_hours));
	}
	public void nativePlace(String place)
	{
		super.nativePlace(place);
		System.out.println(" Daily Wager Native Place:"+place);
	}
}
