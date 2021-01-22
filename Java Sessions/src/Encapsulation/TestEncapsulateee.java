package Encapsulation;

public class TestEncapsulateee {

	public static void main(String[] args) {
		Encapsulationnn en= new Encapsulationnn();
		
		en.setCollege("RGUKT");
		en.setDob(1992);
		en.setmarks(481);
		en.setName("JANNUBHAI");
		
		System.out.println("Duffer name is;"+ en.getName());
		System.out.println("Duffer Dob is;"+ en.getDob());
		System.out.println("Duffer Marks is;"+ en.getmarks());
		System.out.println("Duffer College is;"+ en.getCollege());
		
		

	}

}
