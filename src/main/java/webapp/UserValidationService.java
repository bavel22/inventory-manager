package webapp;

public class UserValidationService {

	public boolean isUserValid(String name, String password) {
		
		if (name.equals("sabri") && password.equals("cool")) 
			return true;
	
		return false;		
	}
}
