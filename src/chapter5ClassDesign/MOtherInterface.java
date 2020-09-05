package chapter5ClassDesign;

public interface MOtherInterface {
	//protected int a=0; => does not compile :only public, static & final are permitted
	int a =0;
//	public default double getTemperature() {
//		return 10.0;
//		}//Note that both methods are assumed to be public , as all methods of an interface are all public .
//Any class that implements IsWarmBlooded may rely on the default implementation of getTemperature() or override the method and create its own version.


}
