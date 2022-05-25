package Strings;

public class StringDemo {
	
	public static void main(String args[])
	{
	char[] name= {'u','m','a'};
	String name1=new String(name);
	String n=new String("hello world");
	String name3="I'm Khyathi";
	String n1="hello world";
	String email="khyathi83@gmail.com";
	String panNo="JKHSK7281A";
	System.out.println(name);
	System.out.println(name1.toUpperCase());
	System.out.println(n);
	System.out.println(name3.substring(4));
	System.out.println(n1.substring(0, 5));
	System.out.println(email.contains("@"));
	String midDigits=panNo.substring(5, 9);
	char lastCharacter=panNo.charAt(9);
	if((Integer.parseInt(midDigits))>0 && (Character.isAlphabetic(lastCharacter)))
	{
		System.out.println("Valid Pan number");
	}
	else
		System.out.println("Invalid Pan Number");
	int amount;
	int principal=10000;
	float interest=10.5f;
	amount=principal*(1+(int)(interest*5));
	System.out.println(amount);
	final char c='u';
	StringBuffer hobby=new StringBuffer("playing shuttle");
	System.out.println(hobby.indexOf("shuttle"));
	hobby.append(",basketball");
	System.out.println(hobby.append(" and football"));
}
	
}