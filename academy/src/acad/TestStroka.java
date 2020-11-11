package acad;

public class TestStroka {

	public static void main(String[] args) {
		String Str = "\"Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.\"";
		int n = 0;
		char symbol;
		for (int i = 0; i < Str.length(); i++) {
			
			symbol = Str.charAt(i);
			if(symbol == 'd') {
				n++;
				System.out.println(n);
			}
		}
		
		//System.out.println(Str.replaceFirst("Object-oriented programming", "OPP"));
	}
	
}
