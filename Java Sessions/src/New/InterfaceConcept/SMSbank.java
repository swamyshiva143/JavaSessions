package New.InterfaceConcept;

public class SMSbank extends Worldbank implements USBank, RBI, UKBank {

	//UKBank
	@Override
	public void educationloan() {
		System.out.println("SMSbank....eduloan");
		
	}

	@Override
	public void carloan() {
		System.out.println("SMSbank....carloan");
		
	}

	@Override
	public void homeloan() {
		System.out.println("SMSbank....homeloan");
		
	}
	@Override
	public void trading() {
		System.out.println("SMSbank...trading");
	
		
	}


	//RBI 
	@Override
	public void mutualfunds() {
		System.out.println("SMSbank....mutualfunds");
		
	}

	@Override
	public void zerointerest() {
		System.out.println("SMSbank....zerointerest");		
	}

	//USbank
	@Override
	public void debit() {
		System.out.println("SMSbank....debit");
		
	}

	@Override
	public void credit() {
		System.out.println("SMSbank....credit");
	}

	@Override
	public void transfermoney() {
		System.out.println("SMSbank....transfermoney");
		
		
	}
	//SMSbank own class methods
		public void landloan() {
		System.out.println("SMSbank...landloan");
				
	}

		public void insurance() {
			System.out.println("SMSbank....insurance");
		}

	
	}
