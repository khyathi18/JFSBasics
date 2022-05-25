package exception;

import java.util.Scanner;

public class ExTypes {

	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
		System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
		System.out.println("Divide by 0 is undefined");
		}
		finally
		{
			System.out.println("end of the program");
			sc.close();
		}
	}
}
