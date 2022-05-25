package inheritance;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Bank {

	protected long loanAmount;
	protected float loanInterest=2.5f;
	private long transNo;
	protected String eligibility;
	public Bank(Account account) {
		super();
		// TODO Auto-generated constructor stub
		this.eligibility=account.checkAcc();
	}
	Scanner sc=new Scanner(System.in);
	public void giveLoan()
	{
		if (eligibility=="eligible")
		{
			System.out.println("This customer is eligible to get the loan.");
			System.out.println("Enter the loan amount:");
			loanAmount=sc.nextLong();
		}
		else if(eligibility=="not eligible")
		{
			System.out.println("Customer is not eligible to apply for a loan");
		}
	}
	public void updateDetails()
	{
		LocalDateTime date=LocalDateTime.of(2022, 03, 04, 13, 20);
		System.out.println("Customer applied for loan on "+date);
	}
	public void collectMoney()
	{
		LocalDateTime date=LocalDateTime.of(2022, 03, 18, 10, 20);
		System.out.println("Loan got sanctioned on"+date);
		System.out.println("Interest of Loan amount:"+loanInterest);
	}
	public void transaction()
	{
		System.out.println("Generate Transaction number");
		transNo=sc.nextLong();
		LocalDateTime date=LocalDateTime.of(2022, 03, 18, 14, 40);
		System.out.println("Money got deposited on:"+date);
	}
}
