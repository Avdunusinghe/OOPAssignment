package university;

import java.util.Random;

public  class StudentSupport {
	
	public static String generateID(String prefix) {
		
		 {
			Random ramdom = new Random();
			
			String id = prefix + String.format("%04d", ramdom.nextInt(10000));
			return id;
				
		}

	}		
}
