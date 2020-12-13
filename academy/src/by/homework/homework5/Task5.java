package by.homework.homework5;

import java.util.HashMap;

public class Task5 {

	public static void main(String[] args) {

		String str = "halasstrdfpojesryh";

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.get(str.charAt(i)) != null) {
				int temp = hm.get(str.charAt(i));
				hm.put(str.charAt(i), ++temp);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
		System.out.println("Key:    " + hm.keySet());
		System.out.println("Values: " + hm.values());
	}
}
