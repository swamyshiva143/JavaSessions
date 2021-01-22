package OOPConcept11;

public class WrapperClassConcept {

	public static void main(String[] args) {
		 
		String x="100";
		System.out.println(x+20);	//10020..	String concatenation
				
		//data conversion--- String to int
		int i=Integer.parseInt(x);
		System.out.println(i+20);	//120

		//String to double
		String s= "12.33";
		double d= Double.parseDouble(s);
		System.out.println(d+10);	//22.33
	
		//String to boolean
		String u="true";
		boolean b= Boolean.parseBoolean(u);
		System.out.println(b);		//true
		
		
		//int to String conversion
		int m=200;
		System.out.println(m+30);	//230
		
		String t=String.valueOf(m);
		System.out.println(t+30);		//20030
		
		//double to String conversion
		double r= 143.134;
		System.out.println(r+123);
		
		String v= String.valueOf(r);
		System.out.println(v+123);
		
		//String to int one exception==NumberFormatException
		
		//String c="100A";
		//int j= Integer.parseInt(c);
		//System.out.println(j);	//NumberFormatException
	
		
		int i1=243;
		System.out.println(i1+200);
		String i2=String.valueOf(i1);
		System.out.println(i2+200);
		
		String i3="998877665";
		System.out.println(i3+12345678);
		int i4= Integer.parseInt(i3);
		System.out.println(i4+12345678);
		
	}


}
