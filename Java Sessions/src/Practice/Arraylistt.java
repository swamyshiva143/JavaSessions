package Practice;

import java.util.ArrayList;

public class Arraylistt {

	public static void main(String[] args) {
		
		ArrayList ar= new ArrayList();
		ar.add(111);	//0
		ar.add(222);	//1
		ar.add(333);	//2
		ar.add(444); 	//3
		
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		ar.add("Swamy");	//4
		ar.add("Akula");	//5
		ar.add(123.123);	//6
		ar.add('A');		//7
		
		System.out.println(ar.size());
		System.out.println(ar.get(5));
		
		//to get all the values of arraylist--use for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(i);

			System.out.println(ar.get(i));
					}
		System.out.println("********************************");

		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(1110);		//0
		ar1.add(2221);		//1
		ar1.add(3332);		//2
		ar1.add(4443);		//3
		
		System.out.println(ar1.size());
		System.out.println(ar1.get(2));
		
		System.out.println("*************************************");
		
		ArrayList<String> x= new ArrayList<String>();
		x.add("Shiva");
		x.add("Thopu");
		x.add("HERO");
		x.add("BULLET");
		
		System.out.println(x.size());
		System.out.println(x.get(2));
		
		for(int j=0;j<x.size();j++) {
			System.out.println(x.get(j));
			
		}
		ArrayList<Double> d= new ArrayList<Double>();
		d.add(12.12);
		d.add(13.13);
		d.add(14.14);
		d.add(15.15);
		d.add(16.16);
		
		System.out.println(d.size());
		System.out.println(d.get(2));
		System.out.println(d.get(4));
		
		d.remove(16.16);
		System.out.println(d.get(3));
		System.out.println(d.size());
		
		
	}
	

}
