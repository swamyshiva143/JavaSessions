package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistConcept {

	public static <E> void main(String[] args) {
		int a[]= new int[3];	//static array--size is fixed

		
		//non generic in java 
		ArrayList ar= new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		
		System.out.println(ar.size());
		
		ar.add(50);
		ar.add(50);
		System.out.println(ar.size());
		ar.add("SWAMY");
		ar.add('A');
		ar.add(123.123);
		ar.add(true);
		
		System.out.println(ar.size());
		System.out.println(ar.get(6));
		
		//to print all the values of arraylist use
		//1.for loop
		//2.iterator
		
		for(int i=0; i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		//generic in java
		
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(111);
		ar1.add(222);
		
		ArrayList<String> ar2= new ArrayList<String>();
		ar2.add("AKULA");
		ar2.add("YASHODA");
		
		ArrayList<Double> ar3= new ArrayList<Double>();
		ar3.add(12.12);
		ar3.add(13.13);
		
		
		ArrayList<E> ar4= new ArrayList<E>();
		//this is used when we dont know which data types we r using..then we add "E"...
		
		
		//addAll Method...
		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("AKULA");
		ar5.add("YASHODA");
		ar5.add("AMMA");
		
		ArrayList<String> ar6= new ArrayList<String>();
		ar6.add("Narayana");
		ar6.add("NANNA");
		ar6.add("HOWLER");
		
		ar5.addAll(ar6);
		
		System.out.println(ar5.size());
		
		for(int i=0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*******************");
		
		//removeAll
		
		ar5.removeAll(ar6);
		
		for(int i=0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("*******************");
		
		//retainAll
		
		ArrayList<String> ar7= new ArrayList<String>();
		ar7.add("AKULA");
		ar7.add("YASHODA");
		ar7.add("AMMA");
		
		ArrayList<String> ar8= new ArrayList<String>();
		ar8.add("Narayana");
		ar8.add("NANNA");
		ar8.add("AKULA");
		
		ar7.retainAll(ar8);
		
		
		System.out.println(ar7.size());

		for(int i=0; i<ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
		
		System.out.println("*******************");
		
		//Employee class objects//
		
		Employee e1= new Employee("SWAMY", 27, "CIVIL");
		Employee e2= new Employee("Akula", 28, "CSE");
		Employee e3= new Employee("SHIVA", 29, "ECE");
		
		ArrayList<Employee> ar9= new ArrayList<Employee>();
		ar9.add(e1);
		ar9.add(e2);
		ar9.add(e3);
		
		//Iterator 
		Iterator<Employee> it= ar9.iterator();
		
		while(it.hasNext()) {
			
			Employee emp= it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		
	
		
	}

}
