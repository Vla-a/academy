package acad;

public class TestStr {

	public static void main(String[] args) {

		String[] st = { "dsf", "styy", "s" };

		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {

				if (st[i].length() > st[j].length()) {
					String a = st[j];
					st[j] = st[i];
					st[i] = a;
				}
			}
			System.out.println(st[i]);
		}

	}

}
