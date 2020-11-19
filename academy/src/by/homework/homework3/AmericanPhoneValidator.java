package by.homework.homework3;

public class AmericanPhoneValidator implements Validator {

	@Override
	public boolean isValid(String str) {
		
		String regex = "^\\+1\\d{6}$";
		
		return str.matches(regex);
	}

}
