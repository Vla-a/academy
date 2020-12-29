package acad.mnogopotok;

public class Aplication {

	public static void main(String[] args) {
		
		NewThread ns = new NewThread();
		Thread th = new Thread(ns);
		Thread th1 = new Thread(ns);
		Thread th2 = new Thread(ns);
		
		th.start();
	}
}
