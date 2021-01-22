package New.InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {

		ApolloHospital ah= new ApolloHospital();
		ah.CancerTreat();
		ah.Skin();
		ah.ENT();
		ah.Gastric();
		ah.Gynecology();
		ah.Orthopedic();
		ah.Oncology();
		ah.Radiology();
		ah.neurology();
		ah.Rheumotology();
		ah.Urology();
		ah.postoperative();
		ah.Fertility();
		ah.entemology();
		
		GovtHospital.sexology();
		
		ah.kidding();
		
		RemedyHospital rh= new ApolloHospital();
		rh.Gynecology();
		rh.Oncology();
		rh.Orthopedic();
		rh.Radiology();
		
		System.out.println(RemedyHospital.min_fee);
		
		
		GovtHospital gh= new ApolloHospital();		//dynamic polymorphism    //top casting
		gh.ENT();
		gh.Rheumotology();
		gh.Urology();
	
	KIMS ks=new ApolloHospital();
	ks.Gastric();
	ks.neurology();
	ks.postoperative();


	}

}
