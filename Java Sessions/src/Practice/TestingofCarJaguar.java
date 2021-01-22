package Practice;

public class TestingofCarJaguar  {

	public static void main(String[] args) {
		
		JAGUAR j= new JAGUAR();	//static polymorphism or comoile-time polymorphism
		j.start();
		j.stop();
		j.refuel();
		j.safejourney();
		j.insurence();
		j.theftsafety();
		j.fastriding();
		j.swamyshiva();
		j.shiva();
		j.refuel();

		System.out.println("****************************");
		
		Carr c=new Carr();
		c.start();
		c.stop();
		c.refuel();
		c.safejourney();
		c.shiva();
		c.swamyshiva();
		
	System.out.println("****************************");
		
		//Dynamic polymorphism or runtime-polymorphism		//top casting
		Carr d= new JAGUAR();
		d.safejourney();
		d.start();
		d.stop();
		d.refuel();
		d.swamyshiva();
		d.shiva();
		
		System.out.println("****************************");
		
		Automobiles a= new Carr();
		a.fastriding();
		a.start();
		a.shiva();
		a.swamyshiva();
		a.refuel();
		a.safejourney();
	
		System.out.println("****************************");
		
		Automobiles b= new JAGUAR();
		b.fastriding();
		b.start();
		b.safejourney();
		b.swamyshiva();
		b.shiva();
		b.refuel();
	
		
	}

}
