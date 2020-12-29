package acad.mnogopotok.cloud;

public class Maus implements Runnable {

	private static class Resours{
		
	}
	
	private final Resours scissors = new Resours();
	private final Resours paper = new Resours();
	
	
	public void doSun() {
		synchronized(scissors) {
			
			System.out.println(Theard.currentTheard().get);
		}
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
