package OOPConcept11;

public class CallValCallRef {
	int a;
	int b;

	public static void main(String[] args) {
		CallValCallRef obj=new CallValCallRef();
		
		obj.a=100;
		obj.b=200;
		
		obj.swamy(obj);
		System.out.println(obj.a);
		System.out.println(obj.b);
			
		

	}
	//CALL BY REFERENCE
	
	public void swamy(CallValCallRef z) {
		int zeal;
		zeal=z.a;	//zeal=100
		z.a=z.b;	//z.a=200
		z.b=zeal;	//z.b=100
		
		
	}

}
