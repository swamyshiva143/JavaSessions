package OOPconcept1;

public class CallbyValAndCallbyRef {
	int p;
	int q;

	public static void main(String[] args) {
	
		CallbyValAndCallbyRef obj= new CallbyValAndCallbyRef();
		int x=10;
		int y=20;
	
		int z=obj.testsum(x, y);	//call by value of pass by value
		System.out.println(z);
		
		obj.p=50;
		obj.q=60;
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		System.out.println("SWAMYSHIVA");
	
		
		obj.swap(obj);
		
		//After swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	
	}
	

	public int testsum(int a, int b) {
		 a=30;
		 b=40;
		int c=a+b;
				
		return c;
	}
	
	//Call by Reference or pass by reference
	
	public void swap(CallbyValAndCallbyRef t) {
		
		int temp;
		temp=t.p;	//temp=50
		t.p=t.q;	//t.p=60
		t.q=temp;	//t.q=50
		
				
		
	}
	
}
