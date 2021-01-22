package New.InterfaceConcept;

public interface GovtHospital {
	
	public void Rheumotology();
	
	public void ENT();
	
	public void Urology();
	
	public static void sexology() {
		System.out.println("gpvt sexology");
	}
	
	default void kidding() {
		System.out.println("Govt kidding");
	}

}
