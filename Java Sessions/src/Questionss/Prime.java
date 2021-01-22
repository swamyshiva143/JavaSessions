package Questionss;

public class Prime {
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public void getPrime(int num) {
		for(int i=-2; i<=num; i++) {
			if(isPrime(i))
				System.out.println(i+"");
		}
	}
	public static void main(String[] args) {
		
	System.out.println("2 is primenumber;" +isPrime(2));
	System.out.println("3 is primenumber;" +isPrime(3));
	System.out.println("41 is primenumber;" +isPrime(41));
	System.out.println("50 is primenumber;" +isPrime(50));
	
	Prime g= new Prime();
	g.getPrime(20);
	g.getPrime(50);
	
	
	}

}
