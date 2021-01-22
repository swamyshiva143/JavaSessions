package ListConcept;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConceot {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		
		//add
		ll.add("Test");
		ll.add("qtp");
		ll.add("Selenium");
		ll.add("Swamy");
		ll.add("Shiva");
		
		//print
		System.out.println("Contents of Linkedlist:"+ll);
		
		//addFirst
		ll.addFirst("Akula");
		System.out.println("Contents of Linkedlist:"+ll);
		
		//addLast
		ll.addLast("Patel");
		System.out.println("Contents of Linkedlist:"+ll);

		//get
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "SWASHI");
		System.out.println("Contents of Linkedlist:"+ll);
		

		ll.set(2, "Legend");
		System.out.println("Contents of Linkedlist:"+ll);
		
		
		//remove first and last elements
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Contents of Linkedlist:"+ll);
		
		//remove middle element
		ll.remove(2);
		System.out.println("Contents of Linkedlist:"+ll);
		
		
		//how to print all the values of linkedlist:
		
		//for loop
		System.out.println("**********Using for loop:");
		for(int n=0; n<ll.size();n++) {
			System.out.println(ll.get(n));
			
		}
		
		//advance for loop
		System.out.println("**********Using advance for loop:");
		for(String str:ll) {
			System.out.println(str);
			
		}
		
		//using iterator
		System.out.println("**********Using iterator:");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//using while loop by < operator
		System.out.println("**********Using while loop:");
		int num=0;
		while(num<ll.size()) {
			System.out.println(ll.get(num));
			num++;
		}
		
		//while loop by > operator
		
		System.out.println("**********Using while loop:");
		int is=0;
		while(ll.size()>is) {
			System.out.println(ll.get(is));
			is++;
		}
		
		//iterator
		System.out.println("**********Using iterator:");
		Iterator<String> go=ll.iterator();
		while(go.hasNext()) {
			System.out.println(go.next());
			
		}
	}
	

}
