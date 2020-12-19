package acad.lesson11;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task1 {

	public static void main(String[] args) {

//		Printable pr = s -> System.out.println(s);
//		pr.print("kjgh");
//
//		Predicate <String> pred = s -> s != null;
//		System.out.println(pred.test(""));
//		
//		Predicate <String> predIs = s -> !s.isEmpty();
//		System.out.println(predIs.test(""));
//		System.out.println(predIs.test("sd"));
//		
//		System.out.println(pred.and(predIs).test("ouhi"));
//		
//		
//		Predicate <String> chekJ = s -> s.startsWith("J");
//		Predicate <String> chekN = s -> s.startsWith("N");
//		Predicate <String> chekA = s -> s.endsWith("A");
//				
//		System.out.println(chekJ.or(chekN).and(chekA).test("NfvA"));

//		Consumer<HeavyBox> com = n -> System.out.println("Отгрузили ящик с весом" + n + "Отправляем ящик с весом" + n);
//		com.getClass();

//		Function <Integer> fun = s -> s > 0 ;
//		
//		System.out.println(fun.);

//		Supplier sup = () ->(int) (Math.random() * 10);
//		System.out.println(sup.get());
		
//		7.	Написать лямбда выражение, которое принимает на вход число и возвращает значение
//		“Положительное число”, “Отрицательное число” или  “Ноль”. 
//		Используем функциональный интерфейс Function.
		
		Function<Integer, String> fun = x -> {
		
			Integer i = x.compareTo(0);
			switch (i) {
			
			case -1:
				return "не положит";
			case 0:
				return "ноль";
			case 1:
				return "положит";
			}
		
		return "вр";
		};
		
		System.out.println(fun.apply(5));
		System.out.println(fun.apply(-5));
		System.out.println(fun.apply(0));
		
		 
		    
		} 
	}
