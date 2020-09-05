package chapter5ClassDesign;

import methodsAndEncapsulation.InsufficientDataException;


public class MotherClasss extends Exception implements MOtherInterface {
	MOtherInterface m = (MOtherInterface) new MotherClasss();
	
	public int length = 2;
	public MotherClasss() { 
		System.out.println("hello from mother class");
	}
	//************ polymorphism parameters:
	public String polyParamMothCl() {
		return "from mother";
	}
	

public static void main(String[] args) {
	
}
	
	
	public final boolean hasFeathers() {
		return true;
		}
	
	public String getName() {
		return "Unknown";
		}
		public void displayInformation() {
		System.out.println("The bird name is: "+getName());
		}
	
	public void set(){
		
	}
	public static boolean isBiped() {
		return false;
		}
		public void getMarsupialDescription() {
		System.out.println("Marsupial walks on two legs: "+isBiped());
		}
		
		//************************
		
	public static void eat() {
		System.out.println("Bear is eating");
		}//Hiding Static Methods
	
	
	private String getNumberOfHumps2() {
		 return "2";
		 }
	protected String getNumberOfHumps() { 
		return "Undefined";
		}
	
	 public void fly() {
		 System.out.println("Bird is flying");
		 }
	 
	 protected boolean hasLegs() throws InsufficientDataException
	 {
		 throw new InsufficientDataException();
		 }
		 protected double getWeight() throws Exception {
		 return 2;
		 }
		 
		
			 protected double getHeight() throws InsufficientDataException {
			 return 2;
			 }
			 protected int getLength() {
			 return 10;
			 }
}
