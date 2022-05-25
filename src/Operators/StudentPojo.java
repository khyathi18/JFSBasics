package Operators;

public class StudentPojo {

	float internalMarks,externalMarks;

	public StudentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentPojo(float internalMarks, float externalMarks) {
		super();
		this.internalMarks = internalMarks;
		this.externalMarks = externalMarks;
	}
	
	@Override
	public String toString() {
		return "\n Internal Marks=" + internalMarks + " \n External Marks=" + externalMarks + " \n";
	}

	//Getter-Setter methods....
	public float getInternalMarks() {
		return internalMarks;
	}

	public void setInternalMarks(int internalMarks) {
		this.internalMarks = internalMarks;
	}

	public float getExternalMarks() {
		return externalMarks;
	}

	public void setExternalMarks(int externalMarks) {
		this.externalMarks = externalMarks;
	}
	
}
