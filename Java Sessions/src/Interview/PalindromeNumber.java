package Interview;

public class PalindromeNumber {
	//141, 1331, 2334332, 78987, 151, 489984
	
	public static void isPalindromeNumber(int num) {
		
		System.out.println("Given number is:" +num);
		
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			r=num%10;		//get the remainder
			sum=(sum*10)+r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not Palindrome number");
		}
		
	}
	
	public static void main(String[] args) {
		isPalindromeNumber(151);
		isPalindromeNumber(12321);
		isPalindromeNumber(1232);
		isPalindromeNumber(78987);
	}

}
