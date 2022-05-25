package inheritance;

public class Account {

	protected long accountNo;
	protected String custName;
	protected long balance;
	protected String accType;
	public Account(Customer customer) {
		super();
		// TODO Auto-generated constructor stub
		this.custName=customer.customerName;
		this.balance=customer.balance;
		this.accType=customer.accountType;
	}
	public void updateAcc()
	{
		System.out.println("Current Account Balance of customer - "+custName+" is "+balance);
	}
	public String checkAcc()
	{
	if(accType.contentEquals("savings") && balance>=50000)
	{
		return "eligible";
	}
	else
	{
		return "not eligilble";
	}
	}
}
