package New.TestCases;

public class MainOver {

	//main method can be overloaded..
	
	public static void main(String[] args) {
		System.out.println("Main method-0");
		
		main("Swamy");
		main(true);
		main(10);
		main(10,20);
		main(12.13);

	}

	public static void main(String args) {
		System.out.println("Main method-1");
	}
	
	public static void main(boolean b) {
		System.out.println("Main method-2");
	}
	
	public static void main(int a) {
		System.out.println("Main method-3");
	}
	
	public static void main(int a, int b) {
		System.out.println("Main method-4");
	}
	public static void main(double d) {
		System.out.println("Main method-5");
	}
}
