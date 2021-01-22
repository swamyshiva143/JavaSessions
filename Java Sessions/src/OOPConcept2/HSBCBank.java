package OOPConcept2;

public class HSBCBank implements USBank, Brazilbank { //we are achieving multiple inheritence
	
	//Is-a relationship
	//if a class is implementing by interface, then it is mandatory to define/override all the methods of interface
	
	//overridden from USBank
	
	public void credit() {
		
		System.out.println("hsbc---credit");
	}
		
		public void debit(){
			System.out.println("hsbc----debit");
					
	}
		public void transfermoney() {
			System.out.println("hsbc---transfermoney");
		}
		
		//separate methods of HSBCBank class
		public void educationloan() {
			System.out.println("hsbc----edu loan");
			
		}
		
		public void carloan() {
			System.out.println("hsbc----carloan");
		}

			//Brazilbank method...overridden from Brazilbank
		public void mutualfund() {
			System.out.println("hsbc----mutualfund");
		}
}
