package OOPConcept2;

public class TestVehicle {

	public static void main(String[] args) {
		Car c= new Car();
		c.start();
		c.stop();
		c.engine();
		c.refuel();
		c.fourwheel();
		c.model();
		c.Swamyshiva();
		c.LOVE();
		
		System.out.println("*******************");
		
		BMW b= new BMW();
		b.start();
		b.stop();
		b.engine();
		b.refuel();
		b.fourwheel();
		b.model();
		b.Swamyshiva();
		b.LOVE();
		
		System.out.println("*******************");
		
		Vehicle v= new Vehicle();
		v.engine();
		v.fourwheel();
		v.model();
		v.Swamyshiva();
		v.LOVE();
		
		System.out.println("*******************");
		
		Vehicle v1= new BMW();
		v1.engine();
		v1.Swamyshiva();
		v1.LOVE();
		v1.fourwheel();
		
		System.out.println("*******************");
		
		Vehicle v2= new Car();
		v2.engine();
		v2.Swamyshiva();
		v2.LOVE();
		v2.fourwheel();
		
		System.out.println("*******************");
		
		Automobiles a= new Automobiles();
		a.Swamyshiva();
		a.LOVE();
	
		
		
	}

}
