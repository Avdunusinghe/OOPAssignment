package university;

public class WeekDay extends Student {
	
	private String freeDay;

	public WeekDay(String name, String address, String sex, String bronYear, String specialization, String freeDay) {
		super(name, address, sex, bronYear, specialization);
		this.freeDay = freeDay;
	}

	@Override
	public void showDetails() {
		super.showDetails();
		System.out.println("Student FreeDay " + this.freeDay);
	}
	
	
	
	

}
