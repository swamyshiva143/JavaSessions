package AbstractClass;

public class Testing extends Animal {
	
	
	public static void main(String[] args) {
		Testing an= new Testing();
		an.bark();
		an.Eat();
		an.Run();
		an.roaring();
		an.biting();
		
		System.out.println(an.age);
		
	}

	@Override
	public void Run() {
		System.out.println("Animal...run");
		
	}

	@Override
	public void Eat() {
		System.out.println("Animal...eat");
		
	}

	@Override
	public void roaring() {
		System.out.println("Animal roaring");
		
	}

}
