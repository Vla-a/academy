package acad;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TestStroka {

	public static void main(String[] args) {
		
		String s = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
		
		
		
			System.out.print(s.replace("Object-oriented programming","OPP"));
		
		/*String str = "\"Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.\"";
		StringBuilder s = new StringBuilder();
		
		
		System.out.println(str.replace("Object-oriented programming","OPP"));
		for (int i = 0; i < str.length(); i++) {
			
			
		}
		
		int n = 0;
		char symbol;
		for (int i = 0; i < Str.length(); i++) {
			
			symbol = Str.charAt(i);
			if(symbol == 'd') {
				n++;
				System.out.println(n);
			}
		}
		
		//System.out.println(Str.replaceFirst("Object-oriented programming", "OPP"));*/
	}
	
}
