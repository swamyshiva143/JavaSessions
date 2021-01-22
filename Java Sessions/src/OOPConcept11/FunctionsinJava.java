package OOPConcept11;

public class FunctionsinJava {
	
	//main method is the starting point of the execution
	public static void main(String[] args) {
		
		FunctionsinJava obj= new FunctionsinJava();
		
		//one object will be created, obj is the reference variable, referring to that object
		//new FunctionsinJava() is the object
		//after creating the object, all non static methods will be given to this object
		
		obj.test();		// test method	
		
		int l= obj.pqr();	//pqr method
		System.out.println(l);	//30

		String s1=obj.qa();		//qa method
		System.out.println(s1);	//selenium
		
		int div=obj.division(30,10);	//division method
		System.out.println(div);		//3
		
		int c1=obj.multiple(20,30);		//multiple method
		System.out.println(c1);		//600
		
		int c2=obj.minus(250, 200);		//minus method
		System.out.println(c2);			//50
		
		double d2=obj.DoubleAdd(40.22, 55.11); 	//DoubleAdd method
		System.out.println(d2);			//95.33
		
		System.out.println("Swamyshiva signing off");
		
		int y=obj.plussing(50,20);
		System.out.println(y);
		
		String s4=obj.pluss();
		System.out.println(s4);
		
		//main method is void-- never return a value
	
	}

		//non static methods
		//void means does not return any value
		//return type-- void
	
	public void test() {		//no input=no output
		System.out.println("test method");
		
	}
		//return type--int
	public int pqr(){			//no input= some output
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
		
	}
		//return type--String
	public String qa() {		//no input= some output
		System.out.println("qa method");
		String s= "Selenium";
		
		return s;
		
	}
			//return type--int
	public int division(int x, int y) {		//input=output
		System.out.println("division method");
		
		int d=x/y;
		
		return d;
	}
		//return type--int
	public int multiple(int a, int b) {	//input=output
		System.out.println("multiple method");
		
		int c=a*b;
		
		return c;
	}
			//return type--int
	public int minus(int a, int b) {	//input=output
		System.out.println("minus method");
		
		int c=a-b;
		
		return c;
		
	}
		//return type--double
	public double DoubleAdd(double a, double b) {	//input=output
		System.out.println("DoubleAdd method");
		
		double d=a+b;
		
		return d;
		
		
	}
	public int plussing(int a, int b) {
		System.out.println("plussing method");
		
		int x=(a+b)*(a-b);
		
		return x;
		
		
		
	}
	public String pluss() {
		System.out.println("pluss method");
		
		String s1="Swamyshiva";
		String s2="Akula";
		
		String s3=s1+s2;
		
		return s3;
	}

}

