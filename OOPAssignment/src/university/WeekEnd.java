package university;

public class WeekEnd extends Student{
	
	private String jobTile;

	
	
	
	public WeekEnd() {
		super();
		this.jobTile = "";
	}
	
	



	@Override
	public void addDetails(String name, String address, String sex, int bornYear, String specialization,
			String remark) {
		// TODO Auto-generated method stub
		super.addDetails(name, address, sex, bornYear, specialization, remark);
		this.jobTile = remark;
	}





	@Override
	public void showDetails() {
		
		super.showDetails();
		System.out.print("Student Job Title " + this.jobTile);
	}

}
