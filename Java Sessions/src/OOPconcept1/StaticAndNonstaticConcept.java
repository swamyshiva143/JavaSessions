package OOPconcept1;

public class StaticAndNonstaticConcept {
	
	String name="Tom";	//non static global var;
	static int age=25;	//static global var;
	
	public static void main(String[] args) {
				
			//how to call static methods and variables
			//1. direct calling
			sum();
			
			//2.by using class name
			StaticAndNonstaticConcept.sum();
			
			System.out.println(age);
			System.out.println(StaticAndNonstaticConcept.age);
			
			//how to call non static methods and vars
			//by using object new class name and obj
			
			StaticAndNonstaticConcept obj= new StaticAndNonstaticConcept();
			
			obj.sendMail();
			System.out.println(obj.name);
			
			//Can i access static methods by using object reference? ====YES
			obj.sum();  //warning will be given

	}
	
	public void sendMail() {	//non static method
		System.out.println("send mail method");
		
	}

	public static void sum() {		//static method
		System.out.println("sum method");
	}
	
}
