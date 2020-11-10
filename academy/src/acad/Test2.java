package acad;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String a[] = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
			System.out.print(a[i] + " "); 
		}
		
		
		for (int i = 0; i < a.length; i++) {
			String ar = a[i];
			
				System.out.print(ar.charAt(i) + " ");
			}
		}
	 
			
	
}
