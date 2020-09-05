package chapter1.javaBuildingBlock;

public class StringAndStringBuilder {

	private void appending() {
		StringBuilder a = new StringBuilder("abc");
		  StringBuilder b = a.append("de");

		 b = b.append("f").append("g");
		 System.out.println("a=" + a);
		 System.out.println("b=" + b); 
//		 ça donne a=abcdefg et b=abcdefg , a et b deux variable qui reference du seul objet StringBuilder
//		 (car new .. est appelée une seule fois => un seul objet :) )
		 
		// StringBuilder b = "rumble";//erreur de comp : String cannot be converted to StringBuilder
	}
	
	private void ObjectsComparing() {
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		// *********************************************************
		
		StringBuilder one1 = new StringBuilder();
		StringBuilder two2 = new StringBuilder("a");
		StringBuilder three3 = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true 
	//********************************************************************
		String s1 = "java";
		  StringBuilder s2 = new StringBuilder("java");
		//  if (s1 == s2)// erreur , incomparable type string and strBuilder

	}
	
	
	private void StringObjects() {
		String a = "Hello World";
		String b = "Hello World";
		//jvm , dans ce cas, crée un seul pool de chaine et 2 pointeurs(donc x == y)

		String c = new String("Hello World");
		String d= "Hello World"; // ici , chaque string est isolée


		String e = "Hello World";
		String f = " Hello World".trim();
		System.out.println(e.equals(f)); // true :  to check the values inside the String rather than the String itself. 
		System.out.println(e==f); // false
		
		String s="hello" ;if ("Hello" == s) System.out.println("four"); // four

		
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));//12
		System.out.println(numbers.substring(7, 7));// rien
		System.out.println(numbers.substring(7));// 78

		//*********************************************************
		
		String y = "";
		y += 2;
		y += 'c';
		y += false;
		if ( y == "2cfalse") System.out.println("==");
		if ( y.equals("2cfalse")) System.out.println("equals"); // equals et pas ==

		String y1 ="";
	//	a = 2; //error
		a += 2;// ça marche
	//********************************************
		
	//	String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
	//	System.out.println(j);
		// a, b, c


	}
}
