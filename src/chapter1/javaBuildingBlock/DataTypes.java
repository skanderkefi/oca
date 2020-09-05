package chapter1.javaBuildingBlock;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DataTypes {
	public void dataTypes() {}
		
		public void ohNo() throws FileNotFoundException {
			throw new RuntimeException();
			}
		
	//What is the data type of x / y?
			short x ;
			short y ;
			 
		//	=> int (supp que la sortie n'est pas short)

			//What is the data type of x + y?
			double x2 ;
			float y2 ;
		//	=> erreur de compilation : il faut ajouter "f" pour assurer la conversion de #double a #float

		//	tout short va être int avant chaque opération

			int x1 = 3;
			int y1 = ++x1 * 5 / x1-- + --x1;

		//	=> y = 4 * 5 / 4 + 2
		//	For the exam, we recommend you memorize this list. Note that boolean and long, and
		//	their associated wrapper classes, are not supported by switch statements.

//			long a= 10;
//			int b =(int) 2 * a; => incompatible types: possible lossy conversion from long to int
			
			
			int primitive = Integer.parseInt("123");// convertir en int
			Integer wrapper = Integer.valueOf("123");// convertir en wrapper class int

}
