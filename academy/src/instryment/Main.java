package instryment;

import by.homework.homework3.Validator;

public class Main implements Instrument{

	public static void main(String... args) {
	Gitara git =new Gitara();
	git.play();
	Tryba tryb = new Tryba();
	tryb.play();
	Baraban bar = new Baraban();
	bar.play();
//	Instrument[] arr = { git, tryb, bar };
//	arr[0] = git;
//	arr[1] = tryb;
//	arr[2] = bar;

//	for (Instrument o : arr) {
//		if (o instanceof Gitara) {
//			System.out.println("SomeInterfaceImpl2");
//		} else {

//		}
//	}
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}
