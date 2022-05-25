package inheritance;

public class Vehicle {

	private String companyName;

	public Vehicle(Company company) {
		super();
		this.companyName = company.companyName;
	}

	@Override
	public String toString() {
		return "Vehicle [companyName=" + companyName + "]";
	}
	
}
