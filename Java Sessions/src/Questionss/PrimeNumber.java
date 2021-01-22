package Questionss;

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		//edge/corner cases
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrimeNumber(int num) {
		for(int i=2; i<=num;i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i+ " ");
			}
		}
	}
	

	public static void main(String[] args) {
		System.out.println("2 is PrimeNumber:" +isPrimeNumber(2));
		System.out.println("3 is PrimeNumber:" +isPrimeNumber(3));
		System.out.println("5 is PrimeNumber:" +isPrimeNumber(5));
		System.out.println("8 is PrimeNumber:" +isPrimeNumber(8));
		System.out.println("123 is PrimeNumber:" +isPrimeNumber(123));
		System.out.println("151 is PrimeNumber:" +isPrimeNumber(151));
		System.out.println("15 is PrimeNumber:" +isPrimeNumber(15));
		System.out.println("50 is PrimeNumber:" +isPrimeNumber(50));
		
		getPrimeNumber(7);
		System.out.println("******************");
		
		getPrimeNumber(20);
		System.out.println("******************");
		
		getPrimeNumber(200);
		
	}

}
