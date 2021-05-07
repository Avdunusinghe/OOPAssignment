package university;

public class WeekDay extends Student {
	
	private String freeDay;

	
	public WeekDay() {
		super();
		this.freeDay = "";
	}
	
	


	@Override
	public void addDetails(String name, String address, String sex, int bornYear, String specialization,
			String remark) {
		// TODO Auto-generated method stub
		super.addDetails(name, address, sex, bornYear, specialization, remark);
		this.freeDay = remark;
	}




	@Override
	public void showDetails() {
		super.showDetails();
		System.out.print("Student FreeDay " + this.freeDay);
	}
	
	
	
	

}
