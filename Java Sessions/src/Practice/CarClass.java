package Practice;

public class CarClass{

int model;
int wheel;

public static void main(String[] args){

Car a= new Car();
Car b= new Car();
Car c= new Car();

a.model=1995;
a.wheel=4;

b.model=2000;
b.wheel=8;

c.model=2005;
c.wheel=12;

System.out.println("Before assigning the references");
System.out.println(a.model);
System.out.println(a.wheel);

System.out.println(b.model);
System.out.println(b.wheel);

System.out.println(c.model);
System.out.println(c.wheel);

System.out.println("After shifting references");

a=b;
b=c;
c=a;

a.model=1500;
System.out.println(a.model);

c.model=1600;
System.out.println(a.model);

	}
}