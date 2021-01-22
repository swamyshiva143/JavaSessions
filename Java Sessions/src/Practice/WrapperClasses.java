package Practice;

public class WrapperClasses{

public static void main(String[] args){

	//1
int a=10;
System.out.println(a+20);

String s= String.valueOf(a);
System.out.println(s+20);

//2
int b=200;
int c=300;
System.out.println(b+c);

String s1=String.valueOf(b);
String s2=String.valueOf(c);
System.out.println(s1+s2);

//3
double d=14.14;
System.out.println(d+20);

String s3=String.valueOf(d);
System.out.println(s3+13.13+12.12);

//4
char x='2';
System.out.println(x);

String s5= String.valueOf(x);
System.out.println(s5+'a');

//5
String a1="100";
System.out.println(a1+200);

int i= Integer.parseInt(a1);
System.out.println(i+200);

//6
String a2="123.154";
System.out.println(a2+145.555);

double d1=Double.parseDouble(a2);
System.out.println(d1+1245.1235);

//7
String e= "true";
System.out.println(e);

boolean b1=Boolean.parseBoolean(e);
System.out.println(b1);
}
}
