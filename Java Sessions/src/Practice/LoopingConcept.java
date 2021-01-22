package Practice;

public class LoopingConcept {

	public static void main(String[] args) {
	
		int a= 1;
		
		while(a<=10) {
		System.out.println(a);
		a=a+1;
		}
		System.out.println("*************************");
		
		for(int b=1; b<=100;b++) {
		System.out.println(b);
		
		}
		System.out.println("**********************");
	
		int c=10;
		while(c>=1) {
			System.out.println(c);
			c--;
		}
		
		for(int d=100; d>=-100; d--) {
		System.out.println(d);
		}
		
		System.out.println("**********************");

		//post increment
		int i=1;
		int j=i++;
		
		System.out.println(i);
		System.out.println(j);
		
		//pre-increment
		
		int k=1;
		int l=++k;
		
		System.out.println(k);
		System.out.println(l);
		
		
		//post-decrement
		
		int m=1;
		int n=m--;
		
		System.out.println(m);
		System.out.println(n);
		
		//pre-decrement
		
		int p=15;
		int q=--p;
		
		System.out.println(p);
		System.out.println(q);
	}
	
	

}
