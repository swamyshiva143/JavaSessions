package OOPConcept11;

public class CallbyValue {

	public static void main(String[] args) {
	
		CallbyValue obj= new CallbyValue();
		int x=200;
		int y=300;
		int v=obj.swashi(x, y);		//CALL BY VALUE
		
		System.out.println(v);
		
		

	}

	public int swashi(int a, int b) {
		a=100;
		b=200;
		int c= a+b;
		
		return c;
		
	}
	
}
