package OOPConcept2;

public class BMW extends Car{	//has-a relationship
	
	//when same method is present in child class and parent class with same name and same number of arguments
	//called Method Overriding
	
	public void start() {		//overridden method
		System.out.println("BMW----start");
					
	}
	public void theftsafety() {
		System.out.println("BMW----theftsafety");
	}
	
	public void LOVE() {
		System.out.println("BMW---LOVE");
	}
}
