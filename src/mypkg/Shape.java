package mypkg;

import java.util.Scanner;

public class Shape 
{
	public static void main(String args[])
	
{
		Scanner sc = new Scanner(System.in);
		Rectangle r=new Rectangle();
		r.welcome();
		int l=sc.nextInt();
		r.setLength(l);
		System.out.println(r.getLength());
		int k=sc.nextInt();
		r.setWidth(k);
		System.out.println(r.getWidth());
		Rectangle.printArea();
		r.printPerimter();
		sc.close();
}

}
