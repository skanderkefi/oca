package chap6Exceptions;

public class tryCatchStatements {
public static void main(String[] args) {
	
	//************* EXAMPLE 1 *****************
//try {		 we can create try finally and without catch
//	}finally{	finally is typically used to close resources such as files or databases
	//When System.exit is called in the try or catch block, finally does not run.
//	}
	// but we cannot do that:
//	try { // DOES NOT COMPILE
//		fall();
//		} finally {
//		System.out.println("all better");
//		} catch (Exception e) {// if we have various exceptions in many catchs blocks, we begin with the mother exception descending to the most subclass exception
//		System.out.println("get up");
//		}
	
	//************* EXAMPLE 2 *****************
//	try {
//		throw new RuntimeException();
//		} catch (RuntimeException e) {
//		throw new RuntimeException();
//		} finally {
//		throw new Exception();
//		}Since the finally block
	//throws an exception of its own , this one gets thrown. The exception from the
	//catch block gets forgotten about.

	
	//************* EXAMPLE 3 *****************

	/*
	 * String result = "";
String v = null;
	 * try {
try {
result += "before";
v.length();
result += "after";
} catch (NullPointerException e) {
result += "catch";
throw new RuntimeException();
} finally {
result += "finally";
throw new Exception();
}
} catch (Exception e) {
result += "done";
}
return result;
 }
 The correct answer is before catch finally done .
	 */

	//************** EXAMPLE 3 ***************
	//checkedExcpMethod()// ça ne marche pas , il faut mettre public static void main(String[] args) throws checkedExcpMethod (declare exception)
	//try {
	//eatCarrot();
	//} catch (NoMoreCarrotsException e ) {// handle exception
	//System.out.print("sad rabbit");
	//}
}
private static void checkedExcpMethod()throws CheckedException {
	
}
}
