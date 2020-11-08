package homework2;
import java.util.Scanner;
public class WordconsoleN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String ar[] = new String[n];

		for (int i = 0; i < n; i++) {
			ar[i] = sc.next();
			System.out.print(ar[i] + " ");
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (ar[i].length() < ar[j].length()) {
					String s = ar[i];
					ar[i] = ar[j];
					ar[j] = s;

				}
			}

		}
		int i = 0;
		System.out.println();

		System.out.println(ar[i]);
	}
}
