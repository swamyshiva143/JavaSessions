package Practice;

public class Car {
	
	int model;
	int wheel;
	int mirrors;
	

	public static void main(String[] args) {
		
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		
		a.model=2015;
		a.wheel=4;
		a.mirrors=2;
		
		
		b.model=2014;
		b.wheel=4;
		b.mirrors=2;
				
		c.model=2013;
		c.wheel=4;
		c.mirrors=2;
		
		System.out.println("Before assigning the references");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(a.mirrors);
		
		System.out.println(b.model);
		System.out.println(a.wheel);
		System.out.println(a.mirrors);
		
		System.out.println(c.model);
		System.out.println(a.wheel);
		System.out.println(a.mirrors);
		
		System.out.println("after shifting references");
		
		a=b;
		b=c;
		c=a;
		
		a.model=10;
		System.out.println(a.model);
		
		c.model=20;
		System.out.println(a.model);
		
		a.wheel=12;
		System.out.println(a.wheel);
		
		c.wheel=15;
		System.out.println(a.wheel);
		
		
		a.mirrors=6;
		System.out.println(a.mirrors);
		
		c.mirrors=8;
		System.out.println(a.mirrors);
		

	}

}
