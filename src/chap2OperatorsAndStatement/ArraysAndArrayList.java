package chap2OperatorsAndStatement;

import java.util.*;

public class ArraysAndArrayList {
	
	
public static void main(String... args) {//String... args c un varargs nommé args et de type String
	String[] strings = { "10", "9", "100" };
	Arrays.sort(strings);// ça donne : 10 100 9 car le string se compare de 1 à 9 (les nombres se comparent avant le les lettre
	//et les min avant maj)
	
	int[] numbers = {2,4,6,8};
	System.out.println(Arrays.binarySearch(numbers, 9)); // -5 : pour informer que ça n'existe pas et quand vous l'inserer 
	//il faut l'inserer dans la case 4 ( il a negaté et abstré 1 (-4-1))
	System.out.println(Arrays.binarySearch(numbers, 2)); // 0
	System.out.println(Arrays.binarySearch(numbers, 4)); // 1
	
	//***************************

// to remove element from array:
	//int[] intArray= {12,14,5,8};
//int[] removed = ArrayUtils.removeElement(intArray, 3);

	
	//**********************************
	
	int[][] vars1= {{54,57},{74,55}}; // 2D array
	int vars2 [][]; // 2D array
	int[] vars3[]; // 2D array
	int[] vars4 [], space [][]; // a 2D AND a 3D array
	//el size mtaa array wla String wla StringBuilder akther mn nb d'elt b 1
	
	for (int[] inner : vars1) {
		 for (int num : inner) {} //=> parcour d'un array à 2 dimensions
	}
	
	
	ArrayList list2 = new ArrayList(10);
	 list2.add("haha");
	ArrayList list3 = new ArrayList(list2);
	System.out.println(list3); // outputs [haha]
	
	//******************************************************
	
	List<Integer> numbeers = new ArrayList<>();
	numbeers.add(1);
	numbeers.add(2);
	numbeers.remove(1);
	System.out.println(numbers); // outputs [1] khater remove aandha methode tekho int comme paramètre et ça c l'index
	//w java ibajel cette methode aala el autoboxing( expl ml int lel Integer)
	
	//***************************************************
	
	//convertion de List à Array :
		 List<String> list = new ArrayList<>();
		 String[] stringArray = list.toArray(new String[0]);

		//convertion de array à list: 
		 String[] array = { "hawk", "robin" }; 
		 List<String> liste = Arrays.asList(array); //returns fixed size list we can never change it w kol ma nbadlou fl l valeur des elements yetbadou al list w array

		//Trier une list :
		List<Integer> numeros = new ArrayList<>();Collections.sort(numeros);
		
		//**************************************************
		char[]c = new char[2];
		//int length = c.capacity; //ne marche pas
		// int length = c.capacity(); //ne marche pas
		 int length = c.length;//ça marche
		// int length = c.length();//ne marche pas
		// int length = c.size;//ne marche pas
		// int length = c.size();//ne marche pas

		 //*******************
		 List<Double> weights = new ArrayList<>();
		 weights.add(50.5); //  autoboxes the double primitive into a Double object and adds that to the List.
		 double first = weights.get(0); // unboxing


}

}
