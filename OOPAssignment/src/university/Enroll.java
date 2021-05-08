package university;
/*IT20025526
 * Dunusinghe A.V.
 * Y1S1 5.2
 */


import java.util.Hashtable;
import java.util.Map;

public class Enroll {
	
	//initialize  HashTable sore the Enroll details
	private  Map<String,String> enroll = new Hashtable<String,String>(); 
	
	public Enroll() {
		
		
	}
	public void enrollStudent(String studentId, String specialization) {
		
		//check Student allready enroll or not
		if(enroll.containsKey(studentId) == false) {
			
			enroll.put(studentId, specialization);
		}
		else {
			System.out.println("Student (" + studentId  +") has Allready enrroled");
		}
		
	}
	
	public void displayEnrolledStudents() {
		
		//print values
		for(Map.Entry<String, String> mapEntry : enroll.entrySet()) {
			
			System.out.println(mapEntry.getKey()+":"+mapEntry.getValue());
		}
	}
}
