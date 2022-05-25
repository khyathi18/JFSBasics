package mypkg;

public class UtilClass {
	int v1,v2;

	public UtilClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UtilClass(int v1, int v2) {
		super();
		this.v1 = v1;
		this.v2 = v2;
	}
	public void arithmetic()
	{
		System.out.println("\n ***Arithmetic Opearators*** \n");
		System.out.println("sum of "+v1+" and "+v2+" is "+(v1+v2)+"\n");
		System.out.println("Difference of "+v1+" and "+v2+" is "+(v1-v2)+"\n");
		System.out.println("Product of "+v1+" and "+v2+" is "+(v1*v2)+"\n");
		System.out.println("Quotient of "+v1+" divided by "+v2+" is "+(v1/v2)+"\n");
		System.out.println("Remainder of "+v1+" divided by "+v2+" is "+(v1%v2)+"\n");
	}
	public void matrix()
	{
		char j[][]=new char[2][2];
		j[0][0]='r';
		j[0][1]='u';
		j[1][0]='o';
		j[1][1]='p';
		System.out.println("\n Diagonal elements are:");
		for(int i=0;i<2;i++)
		{
			for(int k=0;k<2;k++)
			{
				if(i==k)
				{
					System.out.println(j[i][k]);
				}
			}
		}
		float o[][]= {{1.1f,7.5f,8.9f},{2.6f,6.86f,0.22f},{8.21f,8.22f,7,0f}};
		System.out.println("\n Upper Triangular matrix:");
		for(int i=0;i<o.length;i++)
		{
			for(int k=0;k<o[0].length;k++)
			{
			if(i>k)
				System.out.print(0.0f+" ");
			else
				System.out.print(o[i][k]+" ");
			}
			System.out.println();
		}
	}
	public void relational()
	{
		System.out.println("\n ***Relational Opearators*** \n");
		System.out.println("\n is v1 greater than v2? --"+(v1>v2));
		System.out.println("\n is v1 less than v2? --"+(v1<v2));
		System.out.println("\n is v1 greater than or equal to v2? --"+(v1>=v2));
		System.out.println("\n is v1 less than or equal to v2? --"+(v1<=v2));
		System.out.println("\n is v1 equal to v2? --"+(v1==v2));
		System.out.println("\n is v1 not equal to v2? --"+(v1!=v2));
	}
	public void incrementDecrement()
	{
		System.out.println("\n ***Unary Opearators*** \n");
		System.out.println("\n Post Increment of v1 is "+(v1++));
		System.out.println("\n Pre Increment of v2 is "+(++v2));
		System.out.println("\n Post Decrement of v1 is "+(v1--));
		System.out.println("\n Pre Decrement of v1 is "+(--v2));
	}
	void logical()
	{
		System.out.println("\n ***Logical Opearators*** \n");
		System.out.println("AND operator -->"+((v1>=20)&&(v2==10)));
		System.out.println("OR operator -->"+((v1>=20)||(v2==10)));
		System.out.println("NOT operator -->"+(!(v1>=20)));
	}
	public void assignment()
	{
		System.out.println("\n ***Assignment Opearators*** \n");
		System.out.println("sum of "+v1+" and "+v2+" is "+(v1+=v2)+"\n");
		System.out.println("Difference of "+v1+" and "+v2+" is "+(v1-=v2)+"\n");
		System.out.println("Product of "+v1+" and "+v2+" is "+(v1*=v2)+"\n");
		System.out.println("Quotient of "+v1+" divided by "+v2+" is "+(v1/=v2)+"\n");
		System.out.println("Remainder of "+v1+" divided by "+v2+" is "+(v1%=v2)+"\n");
	}
}
