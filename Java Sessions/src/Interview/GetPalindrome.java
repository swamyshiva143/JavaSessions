package Interview;

public class GetPalindrome{

public static void getPalindromeNumber(int num){
System.out.println("Given number is:"+num);
int r=0;
int sum=0;
int t;

t=num;

while(num>0){
r=num%10;
sum=(sum*10)+r;
num=num/10;
}

if(t==sum){
System.out.println("Palindrome Number");
}
else{
System.out.println("Not Palindrome Number");
}
}

public static void main(String[] args){

getPalindromeNumber(131);
getPalindromeNumber(1231);

}
}
