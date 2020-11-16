package by.validator;

public class BelarusPhoneValidator {

	public static boolean isValid(String s) {
        String regex = "^\\+375\\d{9}$"; 
        return s.matches(regex);
    }
}
