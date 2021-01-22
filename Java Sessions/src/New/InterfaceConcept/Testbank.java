package New.InterfaceConcept;

public class Testbank {

	public static void main(String[] args) {
		
		SMSbank sms= new SMSbank();
		sms.debit();
		sms.credit();
		sms.transfermoney();
		sms.trading();
		
		sms.educationloan();
		sms.carloan();
		sms.homeloan();
		
		sms.mutualfunds();
		sms.zerointerest();
		
		sms.insurance();
		sms.landloan();
		
		sms.freeint();
		
		sms.space();
		
		System.out.println(USBank.min_bal);
		System.out.println(RBI.min_bal);
		
		
		USBank us= new SMSbank();
		us.credit();
		us.debit();
		us.trading();
		us.transfermoney();
	
	}

}
