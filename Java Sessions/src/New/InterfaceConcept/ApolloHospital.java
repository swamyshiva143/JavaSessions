package New.InterfaceConcept;

public class ApolloHospital extends SmsHospital implements RemedyHospital, GovtHospital, KIMS{

	@Override
	public void Gastric() {
		System.out.println("Apollo Gastric");
		
	}

	@Override
	public void postoperative() {
		System.out.println("Apollo postoperative");
		
	}

	@Override
	public void neurology() {
		System.out.println("Apollo neurology");
		
	}

	@Override
	public void Rheumotology() {
		System.out.println("Apollo Rheumotology");
		
	}

	@Override
	public void ENT() {
		System.out.println("Apollo ENT");
		
	}

	@Override
	public void Urology() {
		System.out.println("Apollo Urology");
		
	}

	@Override
	public void Gynecology() {
		System.out.println("Apollo Gynecology");
		
	}

	@Override
	public void Orthopedic() {
		System.out.println("Apollo Orthopedic");
	}

	@Override
	public void Radiology() {
		System.out.println("Apollo Radiology");
		
	}

	@Override
	public void Oncology() {
		System.out.println("Apollo Oncology");
		
	}
	
	//Apollo Hospital own Class methods
	
	public void Skin() {
	
	System.out.println("Apollo Skin");
	}
	
	public void CancerTreat() {
		
		System.out.println("Apollo CancerTreat");
	}

	@Override
	public void entemology() {
		System.out.println("Apollo entemology");
		
	}
}
