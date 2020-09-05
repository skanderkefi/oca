package methodsAndEncapsulation;
//static import java.util.Arrays.*; // DOES NOT COMPILE
import static java.util.Arrays.*;
//import static java.util.Arrays; // DOES NOT COMPILE
public class StaticInitializing {
	
	private static int one;
	private static final int two;
	private static final int three = 3;
    //private static final int four; // DOES NOT COMPILE car il doit être initialisé car il est final
	 static {
	 one = 1;
	 two = 2;
	// three = 3; // DOES NOT COMPILE
	// two = 4; // DOES NOT COMPILE  because it knows that the static blocks are the only place the variable could possibly get initialized.
	 }
	
	
	//***************************************
	public static int count=2;
	final String value1 = "1";
	static String value2 = "2";
	String value3 = "3";
	{
	value3 = "d";
	}
	static {
	//value3 = "d"; ===> Cannot make a static reference to the non-static field 
	}
	
	
	static String result = "";
	
	{ result += "c"; }
	static
	{ result += "u"; }
	{ result += "r"; }
	
	//*******************
	
	private String name = "Static class";
	 public static void first() { }
	 public static void second() { }
	 public void third() { System.out.println(name); }
	 
	 
	 //*************************
	 
	 public void passByValueTestMethod(int a) {
		 a+=1;
	 }
	 public static void passByValueTestMethodWithStringBuilder(StringBuilder s) {
		 s.append("Webby");
		}

	
	
	//public static void main(String[] args) {
//		System.out.print(StaticInitializing.result + " ");
//		System.out.print(StaticInitializing.result + " ");
//		new StaticInitializing();
//		new StaticInitializing();
//		System.out.print(StaticInitializing.result + " ");
//	  System.out.println(StaticInitializing.count);
//	   
//	  StaticInitializing h1 = new StaticInitializing();
//	  StaticInitializing h2 = new StaticInitializing();
//	      
//	  System.out.println(h.count);//2
//	    
//	    h = null;
//	       
//	 System.out.println(StaticInitializing.count);//2
	//h1.count += 1;
	//h2.count +=1;
//	   
//	     System.out.println(h.count);//4
//	     } 
//*******************************************
	// first();
	// second();
	// third(); // DOES NOT COMPILE
	// } } //solution 1 taaml objet de cette classe , sol2 : trodha static w hata name trodou statique khater methode statique doit refferer au fields statique
	// sol 3 taayet (qq soit aaml objet de class walé ) lel methode Static (expl Static.third) 

	 
	 //***********************
	 //Arrays.asList("one"); // DOES NOT COMPILE
	// List<String> list = asList("one", "two"); // no Arrays.asList...
	 
	 //***********
//	 int a = 4;
//	   StaticInitializing si = new StaticInitializing();
//	   si.passByValueTestMethod(a);
//	   System.out.println(a);//4 et pas 5 car java est language passe par valeur et pas passe par reference
//	   
	// StringBuilder name = new StringBuilder();
	// passByValueTestMethod2(name);
	// System.out.println(name); // Webby
		//}
	 }

