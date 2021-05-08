package university;

import java.util.Random;

/*IT20025526
 * Dunusinghe A.V.
 * Y1S1 5.2
 */

public  class StudentSupport {
	
	public static String generateID(String prefix) {
		
		 {
			Random ramdom = new Random();
			
			String id = prefix + String.format("%04d", ramdom.nextInt(10000));
			return id;
				
		}
		 
	
	

	}	
	
	
	
			
			

				
		
		
	

}
