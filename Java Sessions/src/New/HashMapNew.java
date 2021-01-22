package New;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapNew {

	public static void main(String[] args) {
	
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(1, "BABY");
		h.put(2, "YOU");
		h.put(3, "ARE MY");
		h.put(4, "LOVE");
		h.put(5, "LIFE");
		
		System.out.println(h);
		System.out.println(h.get(4));
		System.out.println(h.get(6));
		
		h.remove(5);
		System.out.println(h);
		
		for(Entry m: h.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		HashMap<Integer, Student> st= new HashMap<Integer, Student>();
		Student s1= new Student("Swamy", 20, "Maths", 1);
		Student s2= new Student("Shiva", 21, "Social", 11);
		Student s3= new Student("Shyam", 22, "Physics", 15);
		Student s4= new Student("Shankar", 23, "Chemistry", 5);
		Student s5= new Student("Shanvith", 24, "Biology", 10);
		
		st.put(1, s1);
		st.put(2, s2);
		st.put(3, s3);
		st.put(4, s4);
		st.put(5, s5);
		
		//traverse the hashmap ....
		for(Entry<Integer, Student> m: st.entrySet()) {
			int key= m.getKey();
			Student s=m.getValue();
			
			System.out.println("Student-" + key + " " + "Info:");
			System.out.println(s.name+ " " + s.age+ " " + s.subject+ " " + s.rank);
			System.out.println("******");
			
			
			
		}
	}

}
