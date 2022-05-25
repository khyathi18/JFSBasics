package mypkg;

import java.util.Scanner;

public class OperatorSample {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		UtilClass utilclass1=new UtilClass();
		System.out.println("Enter a number:");
		int a[]= {2,9};
		int b[]= {5,6};
		int y=sc.nextInt();
		for(int i=0;i<2;i++)
		{
			UtilClass utilclass=new UtilClass(a[i],b[i]);
		while(y>0)
		{
			int u=sc.nextInt();
			switch(u)
			{
		case 1:
			utilclass.arithmetic();
			break;
		case 2:
			utilclass.relational();
			break;
		case 3:
			utilclass.incrementDecrement();
			break;
		case 4:
			utilclass.logical();
			break;
		case 5:
			utilclass.assignment();
			break;
		default:
			System.out.println("please enter valid number");
		}
			--y;
		}
	}
		utilclass1.matrix();
		
}
}

