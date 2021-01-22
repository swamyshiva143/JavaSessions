package OOPConcept11;

public class LocalVSGlobalVariables {
		
		//Global variables are class variables
		
		String name="Swamyshiva";
		int age=25;

		public static void main(String[] args) {
		//local variables for main method
			
			int i=10;
			System.out.println(i);
		
			LocalVSGlobalVariables obj= new LocalVSGlobalVariables();
			
			
			System.out.println(obj.name);
			System.out.println(obj.age);	
			
	}
		
		public void sum() {
			
			int k=10;		//local variable for sum method
			int l=20;
		
			
			//////////not getting any result
			
			
			System.out.println(k);
			System.out.println(l);
			
			LocalVSGlobalVariables obj= new LocalVSGlobalVariables();
			
			
			System.out.println(obj.name);
			System.out.println(obj.age);	
			
			
		}

}
