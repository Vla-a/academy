package acad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {
	/*1. ����� � ������ �� ������ �������, �� � ������ ����� ����������. ����������
	����� �� ����������
	2. ������� ������ � �������. ���������� ���������� ���� � ������. ����������
	������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����
	������ ����� ����� ���� �������, �� ����� � �������������.
	3. ������� ������ � �������. ������� �����, ������������ �� ��������� ����
	���� ����
	4.�������� ��� ����� ����������� ������������ �������� �����, ����
	� ������� ��������� �������� � String, � ������ � ������� StringBuilder
	� ������ append. �������� �������� �� ����������.
	5. ���� ������:
	" Hey      There!     How      Are you doing"   ;
	�������� ���� 1 ������ ����� ����.
	6. �������� regexp ��� email.*/	
	 public static void main(String[] args) {
	        //3 b 2 �������
	        String s = "liufgg iolutguil liuy jyg  iuluutg, jgkf.";
	        Pattern pattern = Pattern.compile("([a-z�-�])\\b");
	        Matcher matcher = pattern.matcher(s);
	        int count = 0;
	        while (matcher.find()) {
	        	count++;
	            System.out.print(matcher.group(1));
	        }
	        System.out.print(" "+count);
	        //5 �������
	        s = " Hey      There!     How      Are you doing";
	        s = s.replaceAll(" +", " ");
	        System.out.println("\n" + s);
	      //1 �������
	       String sr = "liufgg, iolutguil liuy, jyg  iuluutg, jgkf.";
	        Pattern pattern1 = Pattern.compile("\\,");
	        Matcher matcher1 = pattern1.matcher(sr);
	        
	        while (matcher1.find()) {
	        	System.out.println(sr.substring(matcher1.start(), matcher1.end()));
	    }
	        
}
}
