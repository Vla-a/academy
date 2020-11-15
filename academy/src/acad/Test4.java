package acad;

import java.util.Scanner;


public class Test4 {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String ar[] = new String[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.next();

		}
		sc.close();
		String goal = ar[0];

		for (int i = 0; i < ar.length; i++) {
			
			
			String c;
			StringBuffer u = new StringBuffer();
			for ( i = 0; i < ar[i].length(); i++) {
				 c = String.valueOf(ar[i].charAt(i));
				
				if (u.indexOf(c) == -1) {
					u.append(c);
					//System.out.print(u.append(c)+" ");
				}
				
			}
			int ken =u.length();
			System.out.print(ken);
			
			//if (ken < u.length(i)) {
				//goal = ar[i];
			//}
		}
		
		
		//System.out.println("Ваше слово: " + goal + " Разных символов: " + goal.length());
	}
}