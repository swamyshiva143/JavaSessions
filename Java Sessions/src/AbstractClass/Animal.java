package AbstractClass;

public abstract class Animal {
	
	
	public Animal(){
		System.out.println("Animal class constructor");
	}
	
	int age=20;
	
	public abstract void Run();
	
	public abstract void Eat();
	
	public abstract void roaring();
	
	public void bark() {
		
		System.out.println("Dog animal is Barking ");
	}
	public void biting() {
		
		System.out.println("Dog animal is Biting ");
	}
	
	

}
