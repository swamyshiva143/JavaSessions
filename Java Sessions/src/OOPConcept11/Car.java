package OOPConcept11;

public class Car {
	//class variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new Car() is the object of the class
		// new is used to create the object
		//a,b,c are the object reference variables
		Car a= new Car();
		Car b= new Car();	// Three objects here
		Car c= new Car();
		
		a.mod=2015;
		a.wheel=4;
		
		b.mod=2014;
		b.wheel=4;
		
		c.mod=2013;
		c.wheel=4;
		
		System.out.println("Before assigning the References");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After shifting the References");
		
		//here a shifted to b, b shifted to c and c shifted back to b. a has nothing
		a=b;
		b=c;
		c=a;
		
		a.mod=10;
		
		System.out.println(a.mod);
		
		c.mod=20;
		
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		System.out.println("Swamyshiva signing off");
				
		
	}

}
