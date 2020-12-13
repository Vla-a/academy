package acad.lesson11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DemoHeaveryBox {

	public static void main(String[] args) {
		HeavyBox hbox1 = new HeavyBox(1, 2, 3, 2);
		HeavyBox hbox2 = new HeavyBox(1, 4, 6, 2);
		HeavyBox hbox3 = new HeavyBox(1, 2, 8, 1);
		HeavyBox hbox4 = new HeavyBox(1, 5, 8, 1);

		List<HeavyBox> box = new ArrayList<>();

		box.add(hbox1);
		box.add(hbox2);
		box.add(hbox3);
		box.add(hbox4);

		for (HeavyBox element : box) {

			System.out.println(element.width + " " + element.height + " " + element.depth + " " + element.weight);

		}
		System.out.println("____________________");
		 box.get(1).setHeight(22);
		box.remove(3);
		for (HeavyBox element : box) {

			System.out.println(element.width + " " + element.height + " " + element.depth + " " + element.weight);

			
		}	
	}

}
