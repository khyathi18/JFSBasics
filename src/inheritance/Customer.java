package inheritance;

import java.time.LocalDateTime;
import java.util.Scanner;

import exception.CustomerAccountException;

public class Customer implements Person{
	protected String customerName;
	protected long accountNumber;
	protected String accountType;
	protected String address;
	protected long phoneNumber;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	Scanner sc=new Scanner(System.in);
	public void createAccount()
	{
		System.out.println("\n Enter Customer Name: ");
		customerName=sc.next();
		System.out.println("\n Enter Customer Account Number: \n");
		accountNumber=sc.nextLong();
		System.out.println("\n Enter Customer Account Type: \n");
		accountType=sc.next();
		System.out.println("\n Enter Customer Address: \n");
		address=sc.next();
		System.out.println("\n Enter Customer Phone Number: \n");
		phoneNumber=sc.nextLong();
	}
	@Override
	public void personalDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Date Of Birth of the Customer:");
		String a=sc.next();
		LocalDateTime dob=LocalDateTime.parse(a);
		System.out.println("Enter Aadhar Card Number Of The Customer:");
		long aadhar=sc.nextLong();
		System.out.println("Enter Pan Card Number:");
		String panCard=sc.next();
		
	}
	long amount;
	public void deposit()
	{
		System.out.println("\n Enter the amount you want to deposit: \n");
		amount=sc.nextLong();
	}
	long balance;
	public void withdraw() throws CustomerAccountException
	{
		long amount_w;
		System.out.println("\n Enter the amount you want to withdraw \n");
		amount_w=sc.nextLong();
		balance=amount;
		if (balance<=amount_w)
			throw new CustomerAccountException("Your account balance is less than "+amount_w+"\t Transaction failed");
		else
		{
			balance-=amount_w;
			System.out.println("Balance After withdrawal:"+balance);
		}
		
	}
	@Override
	public String toString() {
		return "Customer Details: \n Customer Name=" + customerName + ",\n Account Number=" + accountNumber + ",\n Account Type="
				+ accountType + ",\n Address=" + address + ", \n Phone Number=" + phoneNumber + ".\n";
	}
	
}
