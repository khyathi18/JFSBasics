package inheritance;
import java.util.LinkedList;

import exception.CustomerAccountException;

public class Details {

	public static void main(String args[])
	{
		StringBuffer application=new StringBuffer("Bank Application");
		System.out.println(application);
		LinkedList<Customer> customer=new LinkedList<Customer>();
		for(int i=0;i<2;i++)
		{
		Customer cust=new Customer();
		customer.add(cust);
		//System.out.println(customer.size());
		cust.createAccount();
		cust.personalDetails();
		System.out.println(cust);
		cust.deposit();
		try
		{
		cust.withdraw();
		Account account=new Account(customer.get(i));
		account.updateAcc();
		Bank bank=new Bank(account);
		bank.giveLoan();
		if(bank.eligibility.contentEquals("eligible"));
		{
			bank.updateDetails();
			bank.collectMoney();
			bank.transaction();
		}
		}
		catch(CustomerAccountException e)
		{
			System.out.println(e);
		}
	}
	}
}