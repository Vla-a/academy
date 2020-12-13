package by.homework.homework5.task3;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
	private T[][] array;
	private int i, j;

	public ArrayIterator(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return i < array.length && j < array[i].length;
	}

	@Override
	public T next() {
		T arr = array[i][j++];
		if (j >= array[i].length) {
			i++;
			j = 0;
		}
		return arr;
	}
}
