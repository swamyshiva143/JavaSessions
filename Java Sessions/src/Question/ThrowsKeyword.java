package Question;

public class ThrowsKeyword {

	public static void main(String[] args) {
		ThrowsKeyword obj= new ThrowsKeyword();

		obj.sum();
		
		System.out.println("Hello");
	}
	
	public void sum() {
		try {
			div();
		}
		catch(ArithmeticException e){
			
		}
		
	}

	public void div() throws ArithmeticException {
		
	int	i=9/0;
	

	
	}
}
