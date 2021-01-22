package OOPConcept11;

public class CallbyReference {
	
	int s;
	int t;

	public static void main(String[] args) {
	
		CallbyReference obj= new CallbyReference();
		
		obj.s=143;
		obj.t=341;
		
		System.out.println(obj.s);
		System.out.println(obj.t);
		
		obj.Rowdy(obj);
		System.out.println(obj.s);
		System.out.println(obj.t);

	}
	
	public void Rowdy(CallbyReference x) {	//CALL BY REFERENCE
		
		int love;
		love=x.s;
		x.s=x.t;
		x.t=love;
		
	}

}
