package inheritance;

public class Student extends Person_ implements Habbits
{

	private int rollno;
	private String dept;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name,int age,int rollno, String dept) {
		super(name,age);
		this.rollno = rollno;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", dept=" + dept + ", name=" + name + ", age=" + age + "]";
	}
	public void personDetails(int height,float weight,char gender)
	{
		System.out.println("Height of the student:"+height);
		System.out.println("Weight of the student:"+weight);
		System.out.println("Gender of the student:"+gender);
	}
	public void nativePlace(String place)
	{
		super.nativePlace(place);
		System.out.println(" Student Native Place:"+place);
	}
	@Override
	public void funnyHabits() {
		// TODO Auto-generated method stub
		System.out.println("UNO");
	}
	
}
