package acad.mnogopotok.Port;

public class PortApplication {

	public static void main(String[] args) throws InterruptedException {
		
		Port port = new Port();
		
		while (true) {
			Thread.currentThread().sleep(10000);
			Thread t = new Thread(new Ship(port));
			t.start();
		}
	}
}
