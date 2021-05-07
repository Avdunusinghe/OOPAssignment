package university;

public class WeekEnd extends Student{
	
	private String jobTile;

	

	public WeekEnd(String name, String address, String sex, String bronYear, String specialization, String jobTile) {
		super(name, address, sex, bronYear, specialization);
		this.jobTile = jobTile;
	}
	
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
		System.out.println("Student Job Title " + this.jobTile);
	}

}
