package exception;

import inheritance.Employee;

public class Logic {

	public static void main(String args[]) throws PersonException
	{
		Employee emp=new Employee("RPSUser22");
		try
		{
		if(((emp.empUserName).substring(0,7))!="RPSUser")
		{
		throw new PersonException("This is not a valid RPS username");
		}
	}
		catch(PersonException e)
		{
			System.out.println(e);
		}
	}
}
