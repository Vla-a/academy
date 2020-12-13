package acad.lesson11;

import java.util.ArrayList;
import java.util.List;
public class HeavyBox {

	int weight;
	int width;
	int height;
	int depth;

	HeavyBox(int w, int h, int d, int m) {

		width = w;
		height = h;
		depth = d;
		weight = m;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	
	

}
