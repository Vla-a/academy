package acad;

import java.util.Scanner;

public class Test1 {

	
		
		
		private static int diffWords(String st) {
			StringBuffer u = new StringBuffer();
			String c;
			for (int i = 0; i < st.length(); i++) {
				c = String.valueOf(st.charAt(i));
				if (u.indexOf(c) == -1) {
					u.append(c);
				}
			}
			return u.length();
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			String a[] = new String[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.next();

			}
			sc.close();
			String goal = a[0];

			for (int i = 0; i < a.length; i++) {

				if (diffWords(a[i]) < diffWords(goal)) {
					goal = a[i];
					
				}
				
			}
			System.out.println("Ваше слово: " + goal + " Разных символов: " + diffWords(goal));
		}
}
