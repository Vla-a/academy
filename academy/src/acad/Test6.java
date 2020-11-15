package acad;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {
	/*1. Ќайти в строке не только зап€тые, но и другие знаки препинани€. ѕодсчитать
	общее их количество
	2. »меетс€ строка с текстом. ѕодсчитать количество слов в тексте. ∆елательно
	учесть, что слова могут раздел€тьс€ несколькими пробелами, в начале и конце
	текста также могут быть пробелы, но могут и отсутствовать.
	3. »меетс€ строка с текстом. ¬ывести текст, составленный из последних букв
	всех слов
	4.Ќапишите два цикла выполн€ющих многократное сложение строк, один
	с помощью оператора сложени€ и String, а другой с помощью StringBuilder
	и метода append. —равните скорость их выполнени€.
	5. ƒана строка:
	" Hey      There!     How      Are you doing"   ;
	оставить лишь 1 пробел между слов.
	6. Ќаписать regexp дл€ email.*/	
	 public static void main(String[] args) {
	        //3 b 2 задание
	        String s = "liufgg iolutguil liuy jyg  iuluutg, jgkf.";
	        Pattern pattern = Pattern.compile("([a-zа-€])\\b");
	        Matcher matcher = pattern.matcher(s);
	        int count = 0;
	        while (matcher.find()) {
	        	count++;
	            System.out.print(matcher.group(1));
	        }
	        System.out.print(" "+count);
	        //5 задание
	        s = " Hey      There!     How      Are you doing";
	        s = s.replaceAll(" +", " ");
	        System.out.println("\n" + s);
	      //1 задание
	       String sr = "liufgg, iolutguil liuy, jyg  iuluutg, jgkf.";
	        Pattern pattern1 = Pattern.compile("\\,");
	        Matcher matcher1 = pattern1.matcher(sr);
	        
	        while (matcher1.find()) {
	        	System.out.println(sr.substring(matcher1.start(), matcher1.end()));
	    }
	        
}
}
