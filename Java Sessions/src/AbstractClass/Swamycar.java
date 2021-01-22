package AbstractClass;

public class Swamycar extends Jaguar{

	@Override
	public void fastspeed() {
		System.out.println("Swamycar fastspeed");
		
	}

	@Override
	public void flexible() {
		System.out.println("Swamycar flexible");
		
	}

	@Override
	public void smoothdrive() {
		System.out.println("Swamycar smoothdrive");
		
	}
	
	public static void main(String[] args) {
		
		Swamycar sc= new Swamycar();
		sc.fastspeed();
		sc.flexible();
		sc.refuel();
		sc.smoothdrive();
		sc.fourwheels();
		
	}

}
