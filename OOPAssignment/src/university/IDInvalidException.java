package university;

//implement  IDInvalidException  Exception
public class IDInvalidException extends Exception {
	
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IDInvalidException(String studentId){
		super("Invalid student ID has  been generated ("+ studentId + " ). Id should have Text Prefix with Minimun 4 digits.");
	}

}
