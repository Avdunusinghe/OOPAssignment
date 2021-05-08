package university;

import java.util.Hashtable;
import java.util.Map;



public class Specialization {
	
	private String specialization;
	private double gpa;
	
	//initialize  HashTable sore the specialization details
	private  Map<String,Double> enroll = new Hashtable<String,Double>(); 
	
	public Specialization() {
		
		this.specialization = "";
		this.gpa = 0;
		
	}
	public void addSpecialization(String specialization, double gpa) {
		
		//check specialization allready enroll or not
		if(enroll.containsKey(specialization) == false) {
			
			enroll.put(specialization, gpa);
		}
		else {
			System.out.println("Student (" + specialization  +") has Allready enrroled");
		}
		
	}

}
