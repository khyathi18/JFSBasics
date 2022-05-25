package mypkg;

public class Rectangle 
{
	private static int length,width;
	public Rectangle(){}
	void welcome()
	{
		System.out.println("Hello Everyone");
	}
	public int getLength()
	{
	return length;
	}
	public void setLength(int l)
	{
		length=l;
	}
	public int getWidth()
	{
	return width;
	}
	public void setWidth(int w)
	{
		width=w;
	}
	public static void printArea() // method definition with return type as integer
	{
	System.out.println("Area of Rectangle is "+(length*width));  //printing area of rectangle
	}
	public void printPerimter()
	{
		System.out.println("Perimeter of Rectangle is "+(2*(length+width)));
	}
	
}
