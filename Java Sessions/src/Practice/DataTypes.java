package Practice;

public class DataTypes {

	public static void main(String[] args) {
		
		int i= 200;
		int j= 300;
		
		int k= i+j;
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(k+(i*j)-k);
		
		
		double d= 12.33;
		double d1= 15.44;
		double d2= 16.45;
		double d3=d+d1+d2;
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d+d1+d2);
		System.out.println("The addition of all three d,d1,d2 is :"+d3);

		
		char a='A';
		char b='1';
		char c='$';
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);
		System.out.println("**********");
		
		
		boolean b1= true;
		boolean b2= false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		String s1="SWAMY";
		String s2="SHIVA";
		String s3="AKULA";
		
		System.out.println(s1);	
		System.out.println(s2);	
		System.out.println(s3);
		System.out.println(s1+s2+s3);	
		
		System.out.println(i+s1+d+j+s2+d2+s3);
		
		
		////IF ELSE and diff Comparison operators
		int x= 100;
		int y=200;
		
		if(x>y) {
			System.out.println("x is greater than y");
		}
		else {
			System.out.println("x is less than y");
		}
		
		
		int e=120;
		int f=150;
		
		if(e==f) {		//= is for assigning and == is for comparing
			
			System.out.println("e is equals to f");
			
		}
		else {
			System.out.println("e is not equals to f");
		}
		
		
		//nested if else---- logic to find highest number
		int a1=100;
		int a2=200;
		int a3=300;
		
		if(a1>a2& a1>a3) {
			System.out.println("a1 is the greatest");
	
	}
		else if(a2>a3) {
			System.out.println("a2 is the greatest");
		}
		else {
			System.out.println("a3 is the greatest");
		}
	}
	
	

}
