package abstraction_Packages_ExpectionHandling;

class InvalidCountryException extends Exception{
	public InvalidCountryException(String msg) {
		super(msg);
	}
}

public class Ques4UserRegistartion {
	
	public void registerUser(String userName,String userCountry) throws InvalidCountryException {
		if(!userCountry.equalsIgnoreCase("India")) {
			throw new InvalidCountryException("User Outside India cannot be registered");
		}else {
			System.out.println("User registration done successfully");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques4UserRegistartion ur=new Ques4UserRegistartion();
		try {
			ur.registerUser("dileep","india");
		}
		catch(InvalidCountryException e){
			System.out.println("InvalidCountryException: "+e.getMessage());
		}

		try {
			ur.registerUser("sam","us");
		}
		catch(InvalidCountryException e){
			System.out.println("InvalidCountryException: "+e.getMessage());
		}
	}

}
