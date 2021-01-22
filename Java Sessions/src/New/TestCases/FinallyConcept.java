package New.TestCases;

public class FinallyConcept {

	public static void main(String[] args) {
		test1();
		test2();
		division();
		divisionn();
		addition();
	}
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException ("test");
		}
		catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside the finally block");
		}
		System.out.println("*********************");
	}
	
	public static void test2() {
		try {
			System.out.println("inside  test2 method ");
		}
		finally {
			System.out.println("finally code in test2 method");
		}
		System.out.println("*********************");
	}
		
	
	
	public static void division() {
		int i=10;
		try {
		System.out.print("inside try block");
		int k=i/0;
		}
		catch(ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}
		finally {
				System.out.println("execute the code even after any exception");	
				}
		System.out.println("*********************");
		
	}

	public static void divisionn() {
		int i=10;
		try {
		System.out.println("inside try block");
		int k=i/0;
		}
		catch(NullPointerException e) {	//some exception if wont catch it... 
			System.out.println("inside catch block");
			System.out.println("divide by zero error");
		}
		finally {
				System.out.println("execute the code even after any exception");	
				}
		System.out.println("*********************");	
	}
	
	public static void addition(){
		int j=20;
		int l=30;
		try {
			System.out.println("inside the try block");
			int m=j+l;
		}
		catch(Exception e) {
			System.out.println("inside the catch block");
		}
		finally {
			System.out.println("Excecute the program final block");
		}
	}
	
}
