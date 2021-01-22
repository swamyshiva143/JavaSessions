package Questionss;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try {
			throw new Exception("Swamy Exception");
		}
		catch(Exception d) {
			d.printStackTrace();
		}
		
		System.out.println("WOrld");
		
		
		String Exce_Flag=" ";
		if(Exce_Flag.equals(" ")) {
			try {
				throw new Exception("Exce flag is blank exception");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("TEST");

	}

}
