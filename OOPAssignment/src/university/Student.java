package university;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Student implements Ifaculties{
	
	protected String name;
	protected String address;
	protected String sex;
	protected int bornYear;
	protected String specialization;
	
	
	//private static int sid =1000;
	protected  int[] marks = new int[5];

	
	
	public Student() {
		this.name = "";
		this.address = "";
		this.sex = "";
		this.bornYear = 0;
		this.specialization = "";
	}

	public void addMarks(int marks0,int marks1, int marks2, int marks3, int marks4) {
		
		marks[0] = marks0;
		marks[1] = marks1;
		marks[2] = marks2;
		marks[3] = marks3;
		marks[4] = marks4;
		
		
	}
	
	public void addDetails(String name, String address, String sex, int bornYear, String specialization, String remark) {
		
		
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.bornYear = bornYear;
		this.specialization = specialization;
		
		
	}
	
	@Override
	public String generateID() {
		
		Random ramdom = new Random();
		String id = String.format("IT%04d", ramdom.nextInt(10000));
		
		
		return id;
		
			
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
