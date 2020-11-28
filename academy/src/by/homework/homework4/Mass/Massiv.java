package by.homework.homework4.Mass;

public class Massiv<T> {

	/*
	 * ������� �����, ������� ��������������� ����� ����� (T). ����� ������ ��������
	 * ������ ���� T. �������� ������ �����������, ������� �� ������� ��������������
	 * ������ ������ ����������� 16. �������� �����������, ����������� �������� int
	 * � ������� �� ������ ������ �������.
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

	

// �������� ������������ �������
	public void chek() {

		for (int i = 0; i < mas.length; i++) {

			System.out.print((T) mas[i] + " ");
		}
		System.out.println();

	}

// 1 ���������� � ������ �������
	public void addProd(T obg) {

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
	}

	/*
	 * public void deleteProd(int index) {
	 * 
	 * if (index > mas.length || index < 0) { System.out.println("Index of bound");
	 * return; } if (arrSize != index) { System.arraycopy(mas, index, mas, index,
	 * mas.length - index - 1); } mas[arrSize] = null; arrSize--; }
	 */
// 2 ����� �������� �� �������
	public T getIndex(int i) {

		return (T) mas[i];
	}
	// 3 ����� ���������� ������������ ��������
	public T getLast() {
		return (T) mas[mas.length - 1];
	}

	// 4 ����� ������� ��������
	public T getFirst() {
		return (T) mas[0];
	}

	// 5 ����� ������� �������
	public int length() {
		return mas.length;
	}
}
