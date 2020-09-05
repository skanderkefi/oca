package chapter1.javaBuildingBlock;

public class SwitchWithFinalFields {
	private int getSortOrder(String firstName, final String lastName) {
		 String middleName = "Patricia";
		 final String suffix = "JR";
		 int id = 0;
		 switch(firstName) {
		 case "Test":
		 return 52;
		// case middleName: // DOES NOT COMPILE
		 //id = 5;
		// break;
		 case suffix:
		 return 02;
		 
		// case lastName: // DOES NOT COMPILE
		// id = 8;
		// break;
		 default :
		 return 0;
		 
}}}
