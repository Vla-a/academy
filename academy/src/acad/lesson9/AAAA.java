package acad.lesson9;

import java.util.Arrays;

public class AAAA {
	public static void main(String[] args) {

		System.out.println("��������� ���� ����:");
		Pora[] pora = Pora.values();
		for (Pora c : pora) {
			System.out.println(c + "" + c.ordinal());

		}
		Pora por = Pora.OSEN;
	    switch (por) {
	            case OSEN:
	                    System.out.println("� ����� �����");
	                    break;
	            case SPRING:
	                    System.out.println("� ����� �����");
	                    break;
	            case SAMOR:
	                    System.out.println("� ����� ����");
	                    break;
	            case WINTER:
	                    System.out.println("� ����� ����");
	                    break;
	    }
	 
	    Pora pors =  Pora.SPRING;
	    System.out.println( pors.getTemp());
	    System.out.println(pors);
	    
	    Pora pr = Pora.OSEN;
	    Pora pur = Pora.WINTER;
	    Pora par = Pora.OSEN;
	    
	    System.out.println("pr.equals(pur): " + pr.equals(pur));
		System.out.println("pr.equals(par): " + pr.equals(par));
		System.out.println("pr == par: " + (pr == par));
		
		System.out.println("pr.compareTo(pur): " + pr.compareTo(pur));
		System.out.println("pur.compareTo(pr): " + pur.compareTo(pr));
		System.out.println("pr.compareTo(par): " + pr.compareTo(par));
	}
}