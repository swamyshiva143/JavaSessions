package OOPConcept2;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism-------compile-time polymorphism
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		b.engine();
		
		System.out.println("***********");
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();

		System.out.println("***********");
		
		
		//top casting
		Car c1= new BMW();	//child class object can be referred by parent class reference variable
		c1.start();			//called dynamic polymorphism or runtime polymorphism
		c1.stop();
		c1.refuel();
		c1.engine();
		
		//down casting
		BMW b1= (BMW) new Car();	//ClassCastException
		
	}

}
