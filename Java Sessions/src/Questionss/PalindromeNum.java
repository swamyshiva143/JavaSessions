package Questionss;

public class PalindromeNum {
	
	public static void CheckPalindrome(int i) {
		
		System.out.println("Given Number is:"+i);
		int rev=0;
		
		int sum=0;
		int x;
		
		x=i;
		
		while(i>0) {
			rev= i%10;
			sum=(sum*10)+rev;
			i=i/10;
		}
		
		if(x==sum) {
			System.out.println("Palindrome Number");
			}
		else {
			System.out.println("Not Palindrome Number");
		}
	}

	public static void main(String[] args) {
		CheckPalindrome(123);
		CheckPalindrome(12321);
		CheckPalindrome(5678765);
		CheckPalindrome(1);
		CheckPalindrome(2);
		CheckPalindrome(0);
		CheckPalindrome(9);
		CheckPalindrome(999998899);
		CheckPalindrome(123111321);


	}

}
