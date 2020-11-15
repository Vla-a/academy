package by.homework.homework2;

import java.util.Scanner;


public class Words {

	public boolean perm(String s, String t) {
		if (s.length() != t.length()) {
			System.out.println(false);
			return false;
		}

		int[] let = new int[256];

		char[] ar = s.toCharArray();
		for (char c : ar) {
			let[c]++;
		}

		for (int i = 0; i < t.length(); i++) {
			int c = (int) t.charAt(i);
			if (--let[c] < 0) {
				System.out.println(false);
				return false;
			}
		}
		System.out.println(true);
		return true;
	}

	public static void main(String[] args) {

		
		Scanner con = new Scanner(System.in);
		String s = con.nextLine();
		String t = con.nextLine();
		Words comp = new Words();
		comp.perm(s.toLowerCase(), t.toLowerCase());
		con.close();
	}
}
