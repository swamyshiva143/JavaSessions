package JavaBasics;

	import java.util.ArrayList;

public class ArrayListconcpet {

	public static void main(String[] args) {
		
		ArrayList ar= new ArrayList();
		
		ar.add(100);	//0
		ar.add(200);	//1
		ar.add(300);	//2
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		
		ar.add(400);	//4
		ar.add(500);	//5
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		ar.add("Tom");	//6
		ar.add("Hello");	//7
		ar.add(12.33);	//8
		ar.add('M');	//9
		
		System.out.println(ar.size());
		System.out.println(ar.get(7));
		System.out.println(ar.get(8));
		
		
		System.out.println("************");
		
		
		
		//for getting all the values, use for loop
		
		for(int i=0; i<ar.size(); i++) {
		
		System.out.println(ar.get(i));
		}
		
		System.out.println("************");
		
		
		//to get only integer values
		
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		
		ar1.add(123);
		ar1.add(143);
		ar1.add(987);
		
		System.out.println(ar1.size());
		System.out.println(ar1.get(2));
		System.out.println(ar1.get(2)+ar1.get(1));
		
		//to print all the values
		
		for(int i=0;i<ar1.size(); i++) {
			System.out.println(ar1.get(i));
			
		}
		System.out.println("************");
		
		//to get only String values
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("SWAMY");
		ar2.add("AKULA");
		ar2.add("JASHWANTH");
		ar2.add("SHANVITH");
		ar2.add("NARAYANA");
		
		System.out.println(ar2.size());
		System.out.println(ar2.get(2));
		System.out.println(ar2.get(3));
		System.out.println(ar2.get(0));
		
		ar2.remove("NARAYANA");
		ar2.remove("AKULA");
		
		System.out.println(ar2.size());
		
		}


}
