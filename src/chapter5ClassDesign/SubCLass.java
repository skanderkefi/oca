package chapter5ClassDesign;

import methodsAndEncapsulation.InsufficientDataException;

public class SubCLass extends MotherClasss{
	public int length = 5;
	public SubCLass() {
		System.out.println("hello from subclass");
		super.set();
	}
//	public SubCLass(String b) {
//		System.out.println(b);
//		super(b); //erreur de compilation car il faut que super soit au début du constructeur.
//
//	}
	
	
	public String getName() {
		return " Peacock";
		}
	

	
	public static void main(String[] args) {
		SubCLass sc1 = new SubCLass();
		Object sc1AsObject = sc1;// ici , t'as pas modifié l'object , mais t'as créer une aptitude d'accéder à cet objet à partir d'une autre rérefence à part sc1
		//**********************************
		
		MotherClasss m = new MotherClasss();
		SubCLass s = (SubCLass) m; //Although this code will compile without issue, it will throw aClassCastException at runtime since the object being referenced is not an instance of theCapybara class.
		/*on peut appeler à instanceOf() pour vérifier le type de l'objet:
		 * if(rodent instanceof Capybara) {
Capybara capybara = (Capybara)rodent;
}
		 */
		
		
		
		
		SubCLass sc = new SubCLass();//ça donne hello from mother class   hello from subclass
			sc.getMarsupialDescription();
			sc.getKangarooDescription();
			
			//*************************
			SubCLass jellyfish = new SubCLass();
			MotherClasss animal = new SubCLass();
			System.out.println(jellyfish.length);
			System.out.println(animal.length); 
			//outputs 5 2
			
			//*******************************
			
			MotherClasss mc = new SubCLass();
			mc.displayInformation();// prints : The bird name is: Peacock , at runtime the
			//instance uses the overridden version of the method, its related to polymorphism
			
			//******** polymorphism parameters :
			SubCLass.getfromwhat(new MotherClasss());// prints from mother
			SubCLass.getfromwhat(new SubCLass());// prints from sub
			
			}
	
	//************* method which takes any reference
			public void anyref(java.lang.Object object) {
			}
			//*****************
		
		//******
	//******** polymorphism parameters : 
	public String polyParamMothCl() {
		return "from sub";
	}

	public static void getfromwhat(MotherClasss mthrcls) {
		System.out.println(mthrcls.polyParamMothCl());
		
	}
//******************
	
//	public final boolean hasFeathers() {
//		return false; //does not compile because it override a final method
//		}
//	
	public int fly(int height) {//methode overloaded
		System.out.println("Bird is flying at "+height+" meters");
		return height;
		}
//	public double getAverageWeight() {
//		return getAverageWeight()+20; // INFINITE LOOP
//		}
	
//	private int getNumberOfHumps() { // DOES NOT COMPILE : The return type is incompatible with MotherClasss.getNumberOfHumps()
//		return 2;
//		}
	/**doesn’t compile for two reasons. First, it
violates the second rule of overriding methods: the child method must be at least as acces-
sible as the parent. In the example, the parent method uses the protected modifier, but the
child method uses the private modifier, making it less accessible in the child method than
in the parent method. It also violates the fourth rule of overriding methods: the return
type of the parent method and child method must be covariant. In this example, the
return type of the parent method is String , whereas the return type of the child method
is int , neither of which is covariant with each other.
**/
	 private int getNumberOfHumps2() {
		 return 2;
		 }/**Notice that the return type differs in the child method
from String to int . In this example, the method getNumberOfHumps() in the parent class
is hidden, so the method in the child class is a new method and not an override of the
method in the parent class. As you saw in the previous section, if the method in the parent
class were public or protected , the method in the child class would not compile because it
would violate two rules of overriding methods.
**/
	public boolean hasLegs() { //we cant put it as private
		return false;
		}
		protected double getWeight() throws InsufficientDataException{
		return 2;
		} /**The first method, hasLegs() , throws an exception InsufficientDataException
in the parent class but doesn’t throw an exception in the child class. This does not violate the
third rule of overriding methods, though, as no new exception is defined. In other words, a
child method may hide or eliminate a parent method’s exception without issue.
The second method, getWeight() , throws Exception in the parent class
and InsufficientDataException in the child class. This is also permitted, as
InsufficientDataException is a subclass of Exception by construction. **/
		
		
			public static boolean isBiped() {
			return true;
			}
			public void getKangarooDescription() {
			System.out.println("Kangaroo hops on two legs: "+isBiped());
			}
			
			 
			 
//		public class Snake extends Reptile {
//			protected double getHeight() throws Exception { // DOES NOT COMPILE
//			return 2;
//			}
//			protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
//			return 10;
//			} this two methods violate the third rule of overriding
		
		public static void eat() {
			System.out.println("Panda is eating");
			}//The eat() method in the child class hides the eat() method in the parent class.
	
	 
	}
