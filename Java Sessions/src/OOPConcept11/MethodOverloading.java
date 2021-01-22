package OOPConcept11;


public class MethodOverloading{

public static void main(String[] args){
	test(1);	//direct calling
	test(1,2);
	MethodOverloading obj= new MethodOverloading();
	
	MethodOverloading.test(1);		//Calling by class name for static methods
	MethodOverloading.test(2, 3);	//
	
	obj.sum(123);
	obj.sum(123.123);
	obj.sum(123, 143);
}
public static void test(int p){

System.out.println("test method----1 param");
}
public static void test(int a, int b){

System.out.println("test method----2 param");
}

public void sum(int a) {
	System.out.println("sum method----1 param");
}

public void sum(double d) {
	System.out.println("sum method----1 param");
}
public void sum(int a, int b) {
	System.out.println("sum method----2 param");
}
}
