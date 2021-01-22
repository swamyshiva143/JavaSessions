package OOPConcept22;

public class Swamy {

	public static void main(String[] args) {
		
		Male m= new Male();
		m.Eating();
		m.Sleeping();
		m.Fighting();
		m.Production();
		m.Running();
		m.Working();
		m.Destiny();
		m.Future();
		m.Happiness();
		
		System.out.println("*************");
		
		Human h= new Human();
		h.Eating();
		h.Sleeping();
		h.Fighting();
		h.Running();
		h.Destiny();
		h.Future();
		h.Happiness();

		System.out.println("*************");
		
		God g= new God();
		g.Destiny();
		g.Future();
		g.Happiness();
		
		
		System.out.println("*************");
		

		God g1= new Male();
		g1.Destiny();
		g1.Future();
		g1.Happiness();
		g1.Working();
		

	}

}
