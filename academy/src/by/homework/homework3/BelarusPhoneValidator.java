package by.homework.homework3;

public class BelarusPhoneValidator  implements Validator {

	@Override
	public boolean isValid(String str) {
		
		 String regex = "^\\+375\\d{9}$"; 
		
		return str.matches(regex);
	}

}
