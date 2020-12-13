package acad.lesson11;

import java.util.function.Predicate;

public class Task1 {

	public static void main(String[] args) {

		Printable pr = s -> System.out.println(s);
		pr.print("kjgh");

		Predicate <String> pred = s -> s != null;
		System.out.println(pred.test("jhhj"));
		
		Predicate <String> predIs = s -> !s.isEmpty();
		System.out.println(predIs.test(""));
		System.out.println(predIs.test("sd"));
		
		System.out.println(pred.and(predIs).test("fghs"));
		
		
		Predicate <String> chekJ = s -> s.startsWith("J");
		Predicate <String> chekN = s -> s.startsWith("N");
		Predicate <String> chekA = s -> s.endsWith("A");
		
		
		
		System.out.println(chekJ.or(chekN).and(chekA).test("JavA"));
		
	}
}