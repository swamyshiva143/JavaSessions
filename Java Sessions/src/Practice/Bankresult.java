package Practice;

public class Bankresult {

	public static void main(String[] args) {
		Swashibank s= new Swashibank();
		s.credit();
		s.debit();
		s.transfer();
		s.loan();
		s.increment();
		s.zeroint();
		s.mutualfunds();
		s.freecharges();
		s.money();
		s.rupees();
		s.crores();
		
		System.out.println("************************");
		
		Swamybank w=new Swashibank();
		w.credit();
		w.freecharges();
		w.increment();
		w.mutualfunds();
	
		System.out.println("************************");
		
		ShivaBank h= new Swashibank();
		h.credit();
		h.debit();
		h.transfer();
		h.loan();
		System.out.println("************************");
		
		Akulabank k= new Swashibank();
		k.money();
		k.rupees();
		
		
	}

}
