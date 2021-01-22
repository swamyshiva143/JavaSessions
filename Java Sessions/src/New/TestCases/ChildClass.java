package New.TestCases;

public class ChildClass{ //extends parentclass {	//got error because parent class used with final keyword.

	public void start() {	//cannot override the final method from parent class
		System.out.println("Childclass----start method");
	}
}
