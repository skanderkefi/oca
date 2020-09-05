package methodsAndEncapsulation;

public class RightOverloadedMethod {
	//float f = 6.1; // erreur car mm si 1 num après la virgule mais il va comprendre que ça c un double , sauf dans le cas ou on met F   
	
	
	StringBuilder builder;
	private String name = "Torchie";
	 { System.out.println(name); }
	 private static int COUNT = 0;
	 static { System.out.println(COUNT); }
	 { COUNT++; System.out.println(COUNT); }
	 public RightOverloadedMethod() {
	 System.out.println("constructor");
	 }
	static { COUNT += 10; System.out.println(COUNT); }
	public static void play(Long l) { }
	 public static void play(Long... l) { }
	 
	 //********************************
//	 public RightOverloadedMethod (StringBuilder b) {
//		 builder = new StringBuilder(b);
//		}
//	 public StringBuilder getBuilder() {
//		 return new StringBuilder(builder);
//		} // to conserve the immutable class with returning stringBuilder or :
//		public String getValue() {
//		 return builder.toString();
//		}
	 
	 //*******************
	// public void moreE(String[] values, ...int nums) {}// does not compile
	 //public void moreG(String[] values, int[] nums) {}//compile
	 
	 //*********************
//	 public static void hi() {
//		 System.out.println(this.Builder);
//		 }//  error: non-static variable this cannot be referenced from a static context

	 
	 
	 public static void main(String[] args) {
	 //play(4); // DOES NOT COMPILE Java is happy to convert the int 4 to a long 4 or an Integer 4.
	// It cannot handle converting in two steps to a long and then to a Long .
	// play(4L); // calls the Long version
	 
	 //*****************
	// System.out.println("read to construct");
	// new RightOverloadedMethod();The output looks like this: 0 10  read to construct  Torchie 1 constructor
		
			

}
	 
	
		
}
