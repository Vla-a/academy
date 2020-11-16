package by.validator;

public class AmericanPhoneValidator {

	public static boolean isValid(String s) {
		String regex = "^\\+1\\d{6}$";
		return s.matches(regex);
	}
}
