package inheritance;

public class Person_ implements Utils{
	
	protected String name;
	protected int age;
	public Person_() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person_(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person_ [name=" + name + ", age=" + age + "]";
	}
	public void personDetails(int height,float weight)
	{
		System.out.println("Height of the person:"+height);
		System.out.println("Weight of the person:"+weight);
	}
	public void nativePlace(String place)
	{
		System.out.println("Native Place:"+place);
	}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		if(age<10)
			System.out.println("Comics / Cartoon");
		else if(age>=10 && age<=30)
			System.out.println("Text books");
		else if(age>30 && age<60)
			System.out.println("Business Magnets success stories");
		else if(age>=60)
			System.out.println("Holy Books");
	}
}
