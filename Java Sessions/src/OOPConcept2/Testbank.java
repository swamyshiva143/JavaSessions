package OOPConcept2;

public class Testbank {

	public static void main(String[] args) {
		System.out.println(USBank.min_bal);
		
		//static polymorphism
		//has overridden methods
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		hs.educationloan();
		hs.carloan();
		hs.mutualfund();
		
		System.out.println("************");
		
		//dynamic polymorphism
		//child class object can be referred by parent interface reference variable
		
		USBank b= new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();

		
	}

}
