package university;

import java.util.Random;

public class Student implements Ifaculties{
	
	protected String name;
	protected String address;
	protected String sex;
	protected int bornYear;
	protected String specialization;
	protected int StudentID;
	
	//private static int sid =1000;
	
	
	
	
	public Student() {
		this.name = "";
		this.address = "";
		this.sex = "";
		this.bornYear = 0;
		this.specialization = "";
	}

	public void addMarks() {
		
		//List<Integer> marks = ArrayList<>() 
		
		
	}
	
	public void addDetails(String name, String address, String sex, int bornYear, String specialization, String remark) {
		
		
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.bornYear = bornYear;
		this.specialization = specialization;
		
		
	}
	
	@Override
	public String studentID(String ) {
		
		Random ramdom = new Random();
		String id = String.format("%04d", ramdom.nextInt(10000));
		System.out.println("Student Id " + "IT"+id);
	
	/*String prefix = new String();
	int prefixid = Integer.parseInt(prefix);
	
	this.StudentID = prefixid + sid++;*/
	//System.out.println(StudentID);
		
	}
	
	@Override
	public void showDetails() {
		
		System.out.println("Student name " + this.name + "\n"
						  + "Student Address " + this.address + "\n"
						  + "Gender " + this.sex + "\n"
						  + "Student year " + this.bornYear + "\n"
						  + "Student Specialization " + this.specialization);
		
	}

}
