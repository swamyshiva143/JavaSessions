package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class Labour {
	String name;
	int age;
	String village;
	 
	Labour(String name, int age, String village){
		this.name=name;
		this.age=age;
		this.village=village;
	}


	public static void main(String[] args) {
		
		Labour a1= new Labour("ROWDY", 30, "Banjerpally");
		Labour a2= new Labour("GUNDA", 40,"THOGUTA");
		Labour a3= new Labour("DON", 50, "THUKKAPUR");
		Labour a4= new Labour("KING", 60,"BANJERPALLY");
		
		ArrayList<Labour> ar=new ArrayList<Labour>();
		ar.add(a1);
		ar.add(a2);
		ar.add(a3);
		ar.add(a4);
		
		//Iterator
		
		Iterator<Labour> rat= ar.iterator();
			while(rat.hasNext()) {
				Labour r=rat.next();
				
				System.out.println(r.name);
				System.out.println(r.age);
				System.out.println(r.village);
			}
	}

}
