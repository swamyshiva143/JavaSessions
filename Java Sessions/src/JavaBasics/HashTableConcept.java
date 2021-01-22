package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h= new Hashtable();
		h.put(1, 100);
		h.put(2, 200);
		h.put("A", "HELLO");
		h.put("B", "World");
		
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("A"));
		System.out.println(h.get("B"));
	
		h.put(3, "SWAMY");
		h.put(4, "SHIVA");
		h.put("C", 300);
		h.put("D", 400);
	
		System.out.println(h.size());
		System.out.println(h.get(3));
		System.out.println(h.get(4));
		System.out.println(h.get("D"));
		
		System.out.println("*****************");
		
		//to print all the values, use for loop
		
		for(int i=0; i<h.size(); i++) {
			
			System.out.println(h.get(i));
		}
		System.out.println("*****************");
		
		//only integer
		
		Hashtable<Integer, Integer> h1= new Hashtable<Integer, Integer>();
		h1.put(0, 100);
		h1.put(1, 200);
		h1.put(2, 300);
		h1.put(3, 400);
		
		System.out.println(h1.size());
		System.out.println(h1.get(1));
		System.out.println(h1.get(2));
		System.out.println(h1.get(3));
		System.out.println(h1.get(0));
		
		for(int i=0; i<h1.size(); i++) {
			
			System.out.println(h1.get(i));
	}
		
		//integer and string
		Hashtable<Integer, String> h2= new Hashtable<Integer, String>();
		h2.put(0, "SWAMY");
		h2.put(1, "SHIVA");
		h2.put(2, "Akula");
		h2.put(3, "Yashoda");
		h2.put(4, "Narayana");
		
		System.out.println(h2.size());
		System.out.println(h2.get(0));
		System.out.println(h2.get(1));
		System.out.println(h2.get(2));
		System.out.println(h2.get(3));
		
		System.out.println("*********************");
		
		for(int i=0; i<h2.size(); i++) {
			
			System.out.println(h2.get(i));
	}
		
		System.out.println("*********************");
		
		//String to String
		
		Hashtable<String, String> h3= new Hashtable<String, String>();
		h3.put("A", "HELLO");
		h3.put("B", "World");
		h3.put("C", "Hi");
		h3.put("D", "Venus");
			
		System.out.println(h3.size());
		System.out.println(h3.get("A"));
		System.out.println(h3.get("D"));
		
		System.out.println("*********************");
		
		//String to integer
		
		Hashtable<String, Integer> h4= new Hashtable<String, Integer>();
		h4.put("C", 300);
		h4.put("D", 400);
		
		System.out.println(h4.size());
		System.out.println(h4.get("D"));
		System.out.println(h4.get("C"));
	}

}
