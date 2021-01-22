package New.TestCases;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single constructor");
		System.out.println("Constructor with one parameter:"+ i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("Two constructors");
		System.out.println("Constructor with two parameters:"+i);
		System.out.println("Constructor with two parameters:"+j);
	}

	public ConstructorConcept(int a, int b, int c) {
		int d=a+b+c+(a+b);
		
		System.out.println("three constructors");
		System.out.println("Value of a:"+a);
		System.out.println("value of b:"+b);
		System.out.println("value of c:"+c);
		System.out.println("total"+a+b+c);
		System.out.println(a+b+c);
		System.out.println("total value of d:"+d);
	}
	public static void main(String[] args) {
		ConstructorConcept obj= new ConstructorConcept();
		ConstructorConcept obj1= new ConstructorConcept(10);
		ConstructorConcept obj2= new ConstructorConcept(10,20);
		ConstructorConcept obj3= new ConstructorConcept(10,20,30);
	}

}
