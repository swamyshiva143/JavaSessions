package New;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
	
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "Automation");
		hm.put(3, "Java");
		hm.put(4, "Shiva");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(4));
		System.out.println(hm);
		
		hm.remove(3);
		System.out.println(hm.get(1));
		System.out.println(hm);
		
		for(Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
			
		}
		
		HashMap<Integer, Employee> emp= new HashMap<Integer, Employee>();
		Employee e1= new Employee("SWAMY", 25, "CIVIL");
		Employee e2= new Employee("SHIVA", 26, "Chem");
		Employee e3= new Employee("AKULA", 27, "CSE");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
	//traverse the hashmap.....
		for(Entry<Integer, Employee> m: emp.entrySet()) {
			int key= m.getKey();
			Employee e=m.getValue();
			
			System.out.println("Employee" + " " +key + " "+ "Info:");
			System.out.println(e.name+ " " + e.age + " " + e.dept);
			
		}
		
	}

}
