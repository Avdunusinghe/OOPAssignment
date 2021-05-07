package university;

public class OOPMain {

	public static void main(String[] args) {
		
		WeekEnd std1 = new WeekEnd();
		std1.addDetails("ashen", "colombo", "M", 1990, "DS", "QA");
		std1.showDetails();
		String studentid = std1.studentID();
		
		

	}

}
