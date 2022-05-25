package Operators;

public class StudentMarks 
{	
	float intlMarks,extlMarks,total;
	String result="";	
	public StudentMarks(float intlMarks, float extlMarks) {
		super();
		this.intlMarks = intlMarks;
		this.extlMarks = extlMarks;
	}
	public float totalMarks()
	{	
		total=intlMarks+extlMarks;
		return total;   // returns sum of internal marks,external marks, and campus points
	}
	public String checkResult() // checks whether student has passed or failed in the exams
	{
		if ((intlMarks>=14) && (extlMarks>=26))
		{
			result="pass";
			return "Pass";
		}
		else if((extlMarks>=26) && ((total)>=40))
		{
			
			result="pass";
			return "Pass";
		}
		else
		{
			result="fail";
			return "fail";
		}
	}
	public String calculateGrade()
	{
		if (extlMarks<26)
		{
			return "F";
		}
		switch((int)total/10)
		{
		case 10:
		case 9:
			return "O";
		case 8:
			return "A+";
		case 7:
			return "A";
		case 6:
			return "B+";
		case 5:
			return "B";
		case 4:
			return "C";
		default:
			return "F";
		}
	}
}
