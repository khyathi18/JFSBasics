package mypkg;

public class Mobile 
{
	static String m_name;
	private String customerName,customerMailId;
	private static int m_cost;
	public Mobile(String h, int o) {
		// TODO Auto-generated constructor stub
		m_name=h;
		m_cost=o;
		System.out.println("Cost of mobile "+m_name+" is "+m_cost);
	}
	public String getCustomerName()
	{
	return customerName;	
	}
	public String getCustomerMailID()
	{
		return customerMailId;
	}
	public void setCustomerName(String a)
	{
		customerName=a;
	}
	public void setCustomerMailID(String b)
	{
		customerMailId=b;
	}
	public void printCustomerDetails()
	{
		System.out.println("Name and contact number of customer is "+customerName+"\n"+customerMailId);
	}
	}