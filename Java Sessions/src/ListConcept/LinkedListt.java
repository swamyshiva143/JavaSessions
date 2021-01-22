package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListt{


public static void main(String[] args){

LinkedList<String> a= new LinkedList<String>();
a.add("SWAMY");
a.add("shiva");
a.add("hello");

System.out.println(a);

LinkedList<String> a1= new LinkedList<String>();
a1.add("DEnGo");
a1.add("GOtoHEll");
a1.add("NoHeaven");

System.out.println(a1);

a.addFirst("Duffer");
a.addLast("Howler");

a.addAll(a1);

System.out.println(a);

a.removeAll(a1);
System.out.println(a);

a.removeFirst();
a.removeLast();
System.out.println(a);

//for loop

for(int i=0; i<a.size();i++) {
	System.out.println(a.get(i));
	}

//iterator
Iterator<String> j=a1.iterator();
while(j.hasNext()) {
	System.out.println(j.next());
}

//advance for loop

for(String str:a) {
	System.out.println(str);
}

int i=0;
while(i<a1.size()) {
	System.out.println(a1.get(i));
	i++;
}
}
}






