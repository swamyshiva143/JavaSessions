package OOPconcept1;

public class WrapperClassEx {

	public static void main(String[] args) {
		//String to int
		String s="200";
		System.out.println(s+100);
		
		int i= Integer.parseInt(s);
		System.out.println(i+100);
		
		//int to string
		
		int x=200;
		System.out.println(x+300);
		String c= String.valueOf(x);
		System.out.println(c+300);
		
		//boolean to string
		boolean b= true;
		System.out.println(b);
		String v= String.valueOf(b);
		System.out.println(v);
		
		//String to double
		String u="143.143";
		System.out.println(u+123123);
		double f= Double.parseDouble(u);
		System.out.println(f+143);
		
		
		//double to string
		double m= 123.143;
		System.out.println(m+143);
		String t=String.valueOf(m);
		System.out.println(t+143);
		
		

	}

}
