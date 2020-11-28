package acad;
/*6.	�) ������� ���������� ����� � ����� ����������� (T, V, K). 
����� �������� ��� ���������� ���� (T, V, K), �����������,
����������� �� ���� ��������� ���� (T, V, K), ������ ������������ �������� ���� ����������.
������� �����, ��������� �� ������� ����� ������� ��� ���� ���������� ������.
�) �������� ����������� �� ��������� ����: T ������ ����������� ��������� Comparable 
(������-��������, String), V ������ ����������� ��������� Serializable � ��������� 
����� Animal, K ������ ��������� ����� Number.*/

import java.text.ParseException;

public class Klass<T,V,K> {

	private T a;
	private V b;
	private K s;
	
	public static void main(String[] args) throws ParseException {
		Klass lac = new Klass(1,2,3) ;
		System.out.println(lac.getA());
		System.out.println(lac.getS());
		System.out.println(lac.getB());
	}
	public Klass(T a, V b, K s) {
		this.a = a;
		this.b = b;
		this.s = s;
	}
	
	public T getA() {
		return a;
	}

	public void setA(T a) {
		this.a = a;
	}

	public V getB() {
		return b;
	}

	public void setB(V b) {
		this.b = b;
	}

	public K getS() {
		return s;
	}

	public void setS(K s) {
		this.s = s;
	}
	
}
