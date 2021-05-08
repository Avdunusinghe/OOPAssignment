package university;

public class OOPMain {

	public static void main(String[] args) {
		
		WeekEnd student1 = new WeekEnd();
		student1.addDetails("Jane", "Malabe", "F", 1990, "DS", "QA");
		String studentid = student1.generateID();
		student1.addMarks(56, 34,12, 46, 78);
		student1.showDetails();
		System.out.println("Student ID :"+studentid);
		System.out.println();
		
		WeekDay student2 = new WeekDay();
		student2.addDetails("Jim", "Kaluthara", "M", 1991, "SE", "Tuesday");
		String studentid2 = student2.generateID();
		student2.addMarks(78, 89, 45, 87, 90);
		student2.showDetails();
		System.out.println("Student ID :"+studentid2);
		

	}

}
