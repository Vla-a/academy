package by.homework.homework4.Mass;

public class Massiv<T> {

	/*
	 * Создать класс, который параметризуется любым типом (T). Имеет массив объектов
	 * нашего типа T. Содержит пустой конструктор, который по дефолту инициализирует
	 * пустой массив размерности 16. Содержит конструктор, принимающий значение int
	 * и инитает им размер нашего массива.
	 */
	public final static int DEFAULT_ARR_SIZE = 2;

	private int arrSize;
	T[] mas;

	public Massiv() {

		mas = (T[]) (new Object[16]);

	}

	public Massiv(int a) {
		mas = (T[]) (new Object[a]);
	}

// Вывод массива
	public void chek() {

		for (int i = 0; i < mas.length; i++) {

			System.out.print((T) mas[i] + " ");
		}
		System.out.println();

	}

// 1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
	public T addProd(T obg) {

		if (mas == null) {

			mas = (T[]) new Object[DEFAULT_ARR_SIZE];
		} else {
			if (arrSize + 1 > mas.length) {

				T[] tempArray = (T[]) (new Object[mas.length * 2 + 1]);
				System.arraycopy(mas, 0, tempArray, 0, mas.length);
				mas = (T[]) tempArray;
			}
		}
		mas[arrSize++] = obg;
		return obg;
	}

// 2) взятие по индексу get(int i)
	public T getIndex(int i) {

		return (T) mas[i];
	}

// 3) взятие последнего элемента getLast()
	public T getLast() {
		return (T) mas[mas.length - 1];
	}

// 4) взятие первого элемента getFirst()
	public T getFirst() {
		return (T) mas[0];
	}

// 5) вывод размера массива
	public int length() {
		return  mas.length;
	}

// 6) вывод индекса последнего заполненого элемента (не путать с размерностью)
	public int lastIndex() {
		int s = 0;
		for (int i = 0; i < mas.length; i++)
			if (mas[i] == null) {
				s = i - 1;
				break;
			}
		return s;
	}

// 7) удаление элемента по индексу (remove(int i)
	public void ltem(int index) {

		T[] tempArray = (T[]) (new Object[mas.length - 1]);
		System.arraycopy(mas, 0, tempArray, 0, mas.length - 1);
		System.arraycopy(mas, index + 1, tempArray, index, mas.length - index - 1);
		mas = (T[]) tempArray;

	}

//	8) удаление элемента по значению (remove(T obj))
	public void remove(T obg) {
		for (int i = 0; i < mas.length; i++)
			if (mas[i] == obg) {
				ltem(i);
			}

	}
}
