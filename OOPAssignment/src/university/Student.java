package university;

import java.util.UUID;

public class Student implements Ifaculties{
	
	protected String name;
	protected String address;
	protected String sex;
	protected String bronYear;
	protected String specialization;
	
	
	public Student(String name, String address, String sex, String bronYear, String specialization) {
		super();
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.bronYear = bronYear;
		this.specialization = specialization;
	}
	
	public void addMarks() {
		
		
		
	}
	
	@Override
	public void studentID() {
	
	try {
		
		String id;
		UUID std = UUID.randomUUID();
	}
	//catch(IDInvalidException ex) {
		
		System.out.println(ex.getMessage());
	}
	
		
		
	}
	
	@Override
	public void showDetails() {
		
		System.out.println("Student name " + this.name + "\n"
							+ "Student Address " + this.address + "\n"
							+ "Gender " + this.sex + "\n"
							+ "Student year " + this.bronYear + "\n"
							+ "Student Specialization" + this.specialization + "\n");
		
	}

}
