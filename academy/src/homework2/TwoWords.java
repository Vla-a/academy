package homework2;

import java.util.Scanner;

public class TwoWords {

	public static void main(String[] args) {
		int n1;
		Scanner sc = new Scanner(System.in);

		String A = sc.next();
		String B = sc.next();
		int n = A.length();
		int n2 = B.length();
		int n3;
		if (n % 2 == 0) {
			n = n;
			n1 = n / 2;
		} else {
			n = n - 1;
			n1 = n / 2;
		}
		if (n2 % 2 == 0) {
			n2 = n2;
			n3 = n2 / 2;
		} else {
			n2 = n2 - 1;
			n3 = n2 / 2;
		}
		String substr1 = A.substring(0, n1);
		String substr2 = B.substring(n3, n2);
		System.out.print(substr1 + substr2);
	}
}
