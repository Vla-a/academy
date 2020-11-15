package acad;

public class Test5 {

	public static void main(String[] args) {

  String s = "I like Java!!!";
		System.out.println(s.charAt(s.length()-1) );
		System.out.println(s.endsWith("!!!") );
		System.out.println(s.startsWith("I") );
		System.out.println(s.contains("like"));
		System.out.println(s.indexOf("Java"));
		System.out.println(s.replace("a","o"));		
		System.out.println(s.substring(7,11));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		int a = 30;
		int b = 56;
		StringBuilder str1 = new StringBuilder( "30 + 56 ");
		StringBuilder str2 = new StringBuilder( "30 - 56 ");
		StringBuilder str3 = new StringBuilder( "30 * 56 ");
		String st1 = str1.append("= ").append(a+b).toString();
		String st2 = str2.append("= ").append(a-b).toString();
		String st3 = str3.append("= ").append(a*b).toString();
		System.out.println( st1);
		System.out.println(st2);
		System.out.println(str3);
		System.out.println(str1.deleteCharAt(8));
		System.out.println(str1.insert(8, "равно "));
		System.out.println(str3.replace(8, 9, "равно "));
		
	}

}
