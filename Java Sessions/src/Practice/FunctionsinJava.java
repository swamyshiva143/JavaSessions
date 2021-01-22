package Practice;

public class FunctionsinJava{

public static void main(String[] args){

FunctionsinJava obj= new FunctionsinJava();
obj.test();
obj.esteem();

int y=obj.zeal();
System.out.println(y);

int x= obj.swamy();
System.out.println(x);

String s1=obj.shiva();
System.out.println(s1);

int z=obj.Akula(200,20);
System.out.println(z);

int n= obj.ego(100, 200, 50);
System.out.println(n);

double d3= obj.love(123.123, 143.143);
System.out.println(d3);

String s6= obj.miss();
System.out.println(s6);
}

public void test(){
System.out.println("test method");
}
public void esteem() {
	System.out.println("esteem method");
}
public int zeal() {
	System.out.println("zeal method");
	int a=500;
	int b=600;
	int c= 700;
	int m= a+b-c;
	
	return m;
}

public int swamy(){
System.out.println("swamy method");
int a=10;
int b=20;
int c=a+b;

return c;
}

public String shiva(){

System.out.println("shiva method");
String s="Dictator";

return s;
}

public int Akula(int x, int y){
System.out.println("Akula method");
int d=x/y;

return d;
}

public int ego(int x, int y, int z) {
	System.out.println("ego method");
	
	int g= x+y-z;
	
	return g;
}

public double love(double d1, double d2) {
	System.out.println("love method");
	
	double d=d1+d2;
	
	return d;
}

public String miss() {
	System.out.println("miss method");
	String a= "AMMA";
	String b="AYYA";
	String c= "LOVELY";
	
	String s5=a+b+c;
	
	return s5;
	
}
}


