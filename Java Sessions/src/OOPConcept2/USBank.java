package OOPConcept2;

public interface USBank {
	
	int min_bal=100;
	
	public void credit();
	public void debit();
	public void transfermoney();
	
	//interface
	//only method declaration
	// no method body...only method prototype
	//in interface we can declare the variables... variables are static in nature by default
	//variables value will not be changed.. its final/constant in nature
	//no static method in interface
	//no main method in interface
	//we cannot create the object of interface
	//interface is abstract in nature
	
	
}
