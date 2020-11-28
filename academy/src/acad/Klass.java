package acad;
/*6.	а) Создать обобщенный класс с тремя параметрами (T, V, K). 
Класс содержит три переменные типа (T, V, K), конструктор,
принимающий на вход параметры типа (T, V, K), методы возвращающие значения трех переменных.
Создать метод, выводящий на консоль имена классов для трех переменных класса.
б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable 
(классы-оболочки, String), V должен реализовать интерфейс Serializable и расширять 
класс Animal, K должен расширять класс Number.*/

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
