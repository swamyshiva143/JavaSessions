package Encapsulation;

public class TestEncapsulate {

	public static void main(String[] args) {

		Encapsulation obj= new Encapsulation();
		
		obj.setName("Shiva");
		obj.setAge(27);
		obj.setRoll(3184);
		
		
		System.out.println("Swamy's name:"+ obj.getName());
		System.out.println("Swamy's age:"+ obj.getAge());
		System.out.println("Swamy's roll:"+ obj.getRoll());
	}

}
