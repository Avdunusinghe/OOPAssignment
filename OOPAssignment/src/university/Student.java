package university;

import java.util.ArrayList;
import java.util.List;



public abstract class Student  implements Ifaculties{
	
	protected String studentId;
	protected String name;
	protected String address;
	protected String sex;
	protected int bornYear;
	protected String specialization;
	protected  List<Integer> marks = new ArrayList<>();
	

	
	
	public Student() {
		
		this.name = "";
		this.address = "";
		this.sex = "";
		this.bornYear = 0;
		this.specialization = "";
	}
	
	@Override
	public void addMarks(int marks0,int marks1, int marks2, int marks3, int marks4) {
		
		marks.add(marks0);
		marks.add(marks1);
		marks.add(marks2);
		marks.add(marks3);
		marks.add(marks4);
		
		
	}
	
	@Override
	public void addDetails(String name, String address, String sex, int bornYear, String specialization, String remark) {
		
	    
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.bornYear = bornYear;
		this.specialization = specialization;
		
		
	}
	
	@Override
	public void showDetails() {
		
		System.out.println("Student name " + this.name + "\n"
						  + "Student Address " + this.address + "\n"
						  + "Gender " + this.sex + "\n"
						  + "Student year " + this.bornYear + "\n"
						  + "Student Specialization " + this.specialization);
		
	}
	
	//genarate id
	public String genarateId() {
		
		try {
			
			String id =StudentSupport.generateID("IT");
			//call validate method
			validateId(id);
			
			this.studentId = id;
			
			
		}catch(IDInvalidException ex) {
			
			System.out.println(ex.getMessage());
		}
		return studentId;
	}
	
	
	//validate student id
	private void validateId(String studentId) throws IDInvalidException {
		
		String pf = studentId.substring(0,2);
		if(pf != "IT" && studentId.length() < 6) {
			
			
			throw new IDInvalidException(studentId);
		}
	}
	
	

}
