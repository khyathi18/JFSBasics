package mypkg;

import java.util.Scanner;

public class ElectronicPojo // Plain Old Java Object - Model
{
	public static void main(String args[]) {
	ElectronicsStore electronicsstore=new ElectronicsStore();
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<3;i++) {
	String name=sc.next();
	String id=sc.next();
	int cost=sc.nextInt();
	ElectronicsStore electronicsstore1=new ElectronicsStore(name,id,cost);
	System.out.println(electronicsstore1);
}
	sc.close();
	}
}
