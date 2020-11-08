package homework2;

import java.util.Scanner;
import java.util.Arrays;
public class Words {

	Words(){
		
	}
	
		    
	public boolean permutation(String s, String t) {
	    if (s.length() != t.length()) {
	    	System.out.println(false);
	        return false;
	    }

	    int[] letters = new int[256];

	    char[] s_array = s.toCharArray();
	    for (char c : s_array) {
	        letters[c]++;
	    }

	    for (int i = 0; i < t.length(); i++) {
	        int c = (int) t.charAt(i);
	        if (--letters[c] < 0) {
	        	System.out.println(false);
	            return false;
	        }
	    }
	    System.out.println(true);
	    return true;
	}
	
	    
	 public static void main(String[] args) {
		 
      	 Scanner con = new Scanner(System.in);        
			System.out.print("������� ������ �����: ");
			String s = con.nextLine();
			System.out.print("������� ������ �����: ");
			String t = con.nextLine();
		 
		
			Words comp = new Words();
		 comp.permutation( s, t );
	 }

}
