package acad.mnogopotok.Port;

import java.util.Random;

public class Ship implements Runnable {

	private int capacity;
	private boolean inConsumer;
	private Port port;
	private static final int MAX_CAPACITY = 10;

	@Override
	public void run() {
		if (inConsumer) {
			while (capacity <= MAX_CAPACITY) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				port.get();
				capacity++;
			}
		} else {
			while (capacity >= 0) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				port.put();

				capacity--;
			}
		}

	}

	public Ship(Port port) {
		this.port = port;
		init();
	}

	private void init() {

		Random run = new Random();

		this.inConsumer = run.nextBoolean();
		if (!inConsumer) {

			this.capacity = run.nextInt(MAX_CAPACITY);
		}
		System.out.println("Прибыл корабль" + (inConsumer ? "consumer" : "producer"));
	}

}
