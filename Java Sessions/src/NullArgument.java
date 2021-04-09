package Question;

public class NullArgument {

	public static void main(String[] args) {
	//Pass null argument with method overloading of String and Object types
		
		test(null);

	}
	
	public static void test(Object o) {
		System.out.println("Object Argument");
	}
	
	public static void test(String s) {
		System.out.println("String Argument");
	}
	
	//it will print String Argument only because its child of Object class... and most obvious...

}
