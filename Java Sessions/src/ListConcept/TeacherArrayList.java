package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class TeacherArrayList {

	public static void main(String[] args) {
		
		Teacher t1= new Teacher("SWAMY", "TELUGU", 25, 15000, 50.55);
		Teacher t2= new Teacher("Shiva", "ENGLISH", 26, 16000, 60.6);
		Teacher t3= new Teacher("Jannu", "MATHS", 27, 17000, 65.56);
		Teacher t4= new Teacher("Shanvith", "Social", 28, 18000, 70.45);
		Teacher t5= new Teacher("Sunny", "Science", 29, 19000, 75.85);
		
		
		ArrayList<Teacher> ar= new ArrayList<Teacher>();
		ar.add(t1);
		ar.add(t2);
		ar.add(t3);
		ar.add(t4);
		ar.add(t5);
		
		Iterator<Teacher> it=ar.iterator();
		
		while(it.hasNext()) {
			
			Teacher tea= it.next();
			
			System.out.println(tea.name);
			System.out.println(tea.subject);
			System.out.println(tea.age);
			System.out.println(tea.salary);
			System.out.println(tea.weight);
			
		}
		

	}

}
