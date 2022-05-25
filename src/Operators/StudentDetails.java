package Operators;

import java.util.Scanner;

public class StudentDetails 
{
	public static void main(String args[]) 
{
	Scanner sc=new Scanner(System.in);
	int studentsCount=3;
	System.out.println("Examinations Results Of Students");
	while(studentsCount>0)
	{
		String studentName=sc.next();
	System.out.println("Subject wise grade scored by "+studentName+" :");
	for(int i=1;i<=3;i++)
	{
	String subject=sc.next();
	System.out.println("Enter Marks obtained in "+subject+" :");
	float a=sc.nextFloat();
	float b=sc.nextFloat();
	StudentPojo studentpojo=new StudentPojo(a,b);
	System.out.println(studentpojo);
	StudentMarks studentmarks=new StudentMarks(a,b);
	System.out.println("Total marks obtained in "+subject+" --->"+studentmarks.totalMarks());
	System.out.println("Passed or Failed in "+subject+" --->"+studentmarks.checkResult());
	System.out.println("Grade of "+subject+" --->"+studentmarks.calculateGrade());
}
	--studentsCount;
	}
	sc.close();
}
}