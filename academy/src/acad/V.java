package acad;


	public class  V{
		/*public static boolean methodOne() {
			System.out.println("methodOne ");
			return false;
		}

		public static boolean methodTwo() {
			System.out.println("methodTwo ");
			return true;
		}

		public static boolean methodThree() {
			System.out.println("methodThree ");
			return true;
		}

		public static void main(String[] args) {
			System.out.println(Test.methodOne() || Test.methodThree() || Test.methodTwo());
		}
	    public static void main(String[] args) { 
	        Base sub = new Sub(); 
	        sub.test(); 
	    } 
	} */
	 
	/*    public static void main(String[] args) { 
	        Base sub = new Sub(); 
	        sub.test(); 
	    } 
	} 
	 
	class Base { 
	    public static void test() { 
	        System.out.println("Base.test()"); 
	    } 
	} 
	 
	class Sub extends Base { 
	    public static void test() { 
	        System.out.println("Sub.test()"); 
	    } */
	    String s = null; 
	    V(String str){ 
	        this.s = str; 
	    } 
	 
	 
	 
	    public static void main(String[] args) { 
	        V v1 = new V("abc"); 
	        V v2 = new V("abc"); 
	         
	        System.out.println((v1 == v2) + " " + v1.equals(v2));
	        
	        int a = 1; 
	        int b = a++; 
	        int c = -a; 
	        System.out.print(a); 
	        System.out.print(b); 
	        System.out.print(c);
	    } 

}