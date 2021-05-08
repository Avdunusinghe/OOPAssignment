package university;

/*IT20025526
 * Dunusinghe A.V.
 * Y1S1 5.2
 */

public class WeekEnd extends Student{
	
	private String jobTile;

	public WeekEnd() {
		super();
		this.jobTile = "";
	}
	

	@Override
	public void addDetails(String name, String address, String sex, int bornYear, String specialization,
			String remark) {
		
		super.addDetails(name, address, sex, bornYear, specialization, remark);
		this.jobTile = remark;
	}


	@Override
	public void showDetails() {
		
		super.showDetails();
		System.out.println("Student Job Title " + this.jobTile);
	}

}
