package Questionss;

public class FactNum {
	//without recursive--for loop used
	public static int factnum(int num) {
		int fact=1;
		if(num==0)
			return 1;
		
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	//with recursive;
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return(num*factorial(num-1));
		}
	}

	public static void main(String[] args) {
	System.out.println(factnum(1));
	System.out.println(factnum(0));
	System.out.println(factnum(10));
	
	System.out.println(factorial(1));
	System.out.println(factorial(7));
	}

}
