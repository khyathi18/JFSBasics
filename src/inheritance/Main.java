package inheritance;

public class Main {

	public static void main(String args[])
	{
		Person_ person=new Person_("Raghav",20);
		System.out.println("\n ***Person Class*** \n");
		System.out.println(person);
		person.personDetails(157, 65.3f);
		person.nativePlace("Hyderabad");
		person.read();
		Student student=new Student("Chadhana",22,102,"CSE");
		System.out.println("\n ***Student Class*** \n");
		System.out.println(student);
		student.personDetails(140, 45.0f, 'F');
		student.nativePlace("Bangalore");
		student.funnyHabits();
		Employee employee=new Employee(2021,"Jyothi",26,"TeamLead",45700);
		System.out.println("\n ***Employee Class*** \n");
		System.out.println(employee);
		employee.personDetails(140, 45.0f,"jyothi123@gmail.com");
		employee.nativePlace("Mumbai");
		Manager manager=new Manager(4654,"Aruna",33,"Project Manager",150000,"Testing","Cloud Lab","RPS");
		System.out.println("\n ***Manager Class*** \n");
		System.out.println(manager);
		manager.nativePlace("Delhi");
		Daily_Wages daily_wages=new Daily_Wages(3121,"Sarala",36,"Cleaner",200,7);
		System.out.println("\n ***Daily Wages Class*** \n");
		daily_wages.calculateWages();
		System.out.println(daily_wages);
		daily_wages.nativePlace("Odisha");
		System.out.println("\n ***Array Of Objects*** \n");
		Person_ person1[]=new Person_[3];
		person1[0]=new Person_("Asha",30);
		person1[1]=new Person_("Pooja",17);
		person1[2]=new Person_("Joseph",40);
		System.out.println("\n ***Enhanced For Loop*** \n");
		for(Person_ i:person1)
			System.out.println(i);
	}
}
