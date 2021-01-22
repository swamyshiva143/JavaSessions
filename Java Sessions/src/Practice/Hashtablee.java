package Practice;

import java.util.Hashtable;

public class Hashtablee {

	public static void main(String[] args) {
		
		Hashtable h= new Hashtable();
		h.put(1,11);
		h.put(2, 22);
		h.put(3,"Dictator");
		h.put(4, "Legend");
		h.put("a",33);
		h.put("b", 44);
		h.put('s', 55.55);
		h.put('d','G');
		h.put(8, 'X');
		h.put(9, true);
		h.put("True", 999);
		
		
		System.out.println(h.size());
		System.out.println(h.get(1));
		System.out.println(h.get(4));
		System.out.println(h.get("a"));
		System.out.println(h.get('s'));
		System.out.println(h.get(8));
		System.out.println(h.get("True"));
		System.out.println("**************************");
		
		for(int i=0; i<h.size();i++) {
			System.out.println(h.get(i));	//only for integer keys, will get values
		}
		System.out.println("**************************");
		
		//Integer, Integer (key,value)
	
		Hashtable<Integer,Integer> h1= new Hashtable<Integer, Integer>();
		h1.put(0, 121);
		h1.put(1, 132);
		h1.put(2, 143);
		h1.put(3, 154);
		h1.put(4, 165);
		h1.put(5, 176);
		h1.put(6, 187);
		h1.put(7, 198);
		
		System.out.println(h1.size());
		System.out.println(h1.get(0));
		System.out.println(h1.get(3));
		
		
		for(int i=0; i<h1.size();i++) {
			System.out.println(h1.get(i));
		}
		System.out.println("**************************");
		//Integer, String
		Hashtable<Integer,String> h2= new Hashtable<Integer, String>();
		h2.put(1, "swamy");
		h2.put(2, "Shiva");
		h2.put(3, "jashwanth");
		h2.put(4, "Shanvith");
		
		System.out.println(h2.size());
		System.out.println(h2.get(1));
		System.out.println(h2.get(3));
		System.out.println(h2.get(2));
		System.out.println(h2.get(4));
		
		System.out.println("**************************");
		//String, String
		
		Hashtable<String,String> h3= new Hashtable<String, String>();
		h3.put("A", "SWAMYSHIVA");
		h3.put("HE", "HELLO");
		h3.put("DON", "KING");
		
		System.out.println(h3.size());
		System.out.println(h3.get("DON"));
		
		System.out.println("**************************");
		
		//String, Integer
		Hashtable<String, Integer> g= new Hashtable<String, Integer>();
		g.put("A", 143);
		g.put("B", 143);	//values will be same but keys should not be the same....
		g.put("C", 143);
		
		System.out.println(g.size());
		System.out.println(g.get("A"));
		System.out.println(g.get("B"));
		System.out.println(g.get("C"));
		
		
		Hashtable<Double, Integer> d= new Hashtable<Double, Integer>();
		d.put(1.11, 1);
		d.put(2.12, 2);
		d.put(3.23, 3);
		
		
		System.out.println(d.get(1.11));
		
	}

}
