package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class University {
	String name;
	String place;
	int year;
	String dept;
	int staff;
	int students;
	
	University(String name, String place, int year, String dept,int staff,int students){
		
		this.name=name;
		this.place=place;
		this.year=year;
		this.dept=dept;
		this.staff=staff;
		this.students=students;
		
	}
	
	
	public static void main(String[] args) {
		
		University u1= new University("IIIT", "BASAR", 2008, "ENGINEERING",1000, 6000);
		University u2= new University("RGUKT", "RKVALLEY", 2010, "SCIENCE",1500, 9000);
		University u3= new University("IIIT", "NUZIVEEDU", 2008, "ENGINEERING",1000, 6000);
		University u4= new University("JNTU", "HYD", 2000, "ARTS",2000, 9000);
		University u5= new University("IIT", "BOMBAY", 1990, "TECHNOLOGY",600, 1200);
		
		ArrayList<University> un=new ArrayList<University>();
		un.add(u1);
		un.add(u2);
		un.add(u3);
		un.add(u4);
		un.add(u5);
		
		//Iterator
		Iterator<University> ver= un.iterator();
		
		while(ver.hasNext()) {
			
			University uni= ver.next();
			
			System.out.println(uni.name);
			System.out.println(uni.place);
			System.out.println(uni.year);
			System.out.println(uni.dept);
			System.out.println(uni.staff);
			System.out.println(uni.students);
			
		}
		
		 System.out.println("**************************");
		
		
		University u6= new University("IIIT", "BASAR", 2008, "ENGINEERING",1000, 6000);
		University u7= new University("RGUKT", "RKVALLEY", 2010, "SCIENCE",1500, 9000);
		University u8= new University("IIIT", "NUZIVEEDU", 2008, "ENGINEERING",1000, 6000);
		
		ArrayList<University> ar=new ArrayList<University>();
		ar.add(u6);
		ar.add(u7);
		ar.add(u8);
		
		Iterator<University> it=ar.iterator();
		
		while(it.hasNext()) {
			 University ty= it.next();
			 
			 
			 System.out.println(ty.name);
			 System.out.println(ty.place);
			 System.out.println(ty.year);
			 System.out.println(ty.dept);
			 System.out.println(ty.staff);
			 System.out.println(ty.students);
			
		}
		
		 System.out.println("**************************");
		
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(12);
		ar1.add(13);
		ar1.add(14);
		ar1.add(15);
		

		ArrayList<Integer> ar2= new ArrayList<Integer>();
		ar2.add(16);
		ar2.add(17);
		ar2.add(18);
		ar2.add(19);
		
		
		ar1.addAll(ar2);
		
		for(int i=0; i<ar1.size();i++) {
			
			System.out.println(ar1.get(i));
		}
		
		System.out.println("**************************");
		
		ar1.removeAll(ar2);
		
		for(int i=0; i<ar1.size();i++) {
			
			System.out.println(ar1.get(i));
		}
		
		 System.out.println("**************************");
			
			ArrayList<Integer> ar3= new ArrayList<Integer>();
			ar3.add(12);
			ar3.add(13);
			ar3.add(14);
			ar3.add(15);
			

			ArrayList<Integer> ar4= new ArrayList<Integer>();
			ar4.add(12);
			ar4.add(14);
			ar4.add(18);
			ar4.add(19);
			
			ar3.retainAll(ar4);
			
			for(int i=0; i<ar3.size();i++) {
				
				System.out.println(ar3.get(i));
				
			}
	}

}
