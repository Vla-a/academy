package by.homework.homework7.Task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import by.academy.lesson15.Tigr;

public class Main {

	public static void main(String[] args)  {

		Class<Person> pers = Person.class;
		Method[] methods = pers.getMethods();
		System.out.println("-----------------------");
		System.out.println("Declared method: ");
		System.out.println("-----------------------");
		for (Method method : methods) {

			System.out.println(method.getName());
		}

		Method[] methodss = pers.getDeclaredMethods();
		System.out.println("-----------------------");
		System.out.println("method: ");
		System.out.println("-----------------------");
		for (Method method : methodss) {

			System.out.println(method.getName());
		}
//	

		System.out.println("----------------");
		try {
			
			Person per = pers.getDeclaredConstructor().newInstance();			
		Method mPrint = pers.getDeclaredMethod("slepp");					
		mPrint.setAccessible(true);
			mPrint.invoke(per);
		

//			Pep pep = mPrint.getAnnotation(Pep.class);
//			System.out.println(pep.name());
		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("----------------");
		try {
			
			Person perso = pers.getConstructor().newInstance();			
		Method mPrin = pers.getMethod("slepp");					
		mPrin.setAccessible(true);
			mPrin.invoke(perso);

		} catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		Class<User> user = User.class;
//		Method[] methodsUser = user.getMethods();
//		System.out.println("-----------------------");
//		System.out.println("Declared method: ");
//		System.out.println("-----------------------");
//		for (Method method : methodsUser) {
//
//			System.out.println(method.getName());
//		}
//		Method[] methodssUser = user.getDeclaredMethods();
//		System.out.println("-----------------------");
//		System.out.println("method: ");
//		System.out.println("-----------------------");
//		for (Method method : methodssUser) {
//
//			System.out.println(method.getName());
//		}

	}

}
