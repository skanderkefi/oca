package methodsAndEncapsulation;

public class CallingPriority {
	CallingPriority() {
		System.out.print("1 ");
		}
	CallingPriority(int num) {
		System.out.print("2 ");
		}
	CallingPriority(Integer num) {
		System.out.print("3 ");
		}
	CallingPriority(Object num) {
		System.out.print("4 ");
		}
	CallingPriority(int... nums) {
		System.out.print("5 ");
		}
		public static void main(String[] args) {
		new CallingPriority(100);
		new CallingPriority(1000L); //outputs 2 4  and if we remove the constructor with int parameter , it will output 3 4
		// and if we remove Integer parameter , it will output 4 4
}
		
		//public void final walk6() {} // DOES NOT COMPILE
		final public void walk7() {}//  COMPILE
		public void walk2() { return; } // comppile
		public void Walk_$() { } //compile

		public void walk1(int... nums) { }
		public void walk2(int start, int... nums) { }
		//public void walk3(int... nums, int start) { } // DOES NOT COMPILE car le varargs n'est pas le dernier dans les paramètres
		//public void walk4(int... start, int... nums) { } // DOES NOT COMPILE


}
