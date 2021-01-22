package Practice;

public class GlobalLocal{

String name="SWAMY";
int age=28;
double hut=123.143;
char kiss='w';
boolean buss=true;

public static void main(String[] args){

int i=500;

System.out.println(i);

GlobalLocal obj= new GlobalLocal();
System.out.println(obj.name);
System.out.println(obj.age);
System.out.println(obj.hut);
System.out.println(obj.kiss);
System.out.println(obj.buss);

int h=obj.sum();
System.out.println(h);

double d5=obj.disk();
System.out.println(d5);
}

public int sum(){
int j=100;
int k=200;

int l=j+k;

return l;

}

public double disk() {
	double d1=12.12;
	double d2=13.13;
	
	double d3=d1+d2;
	
	return d3;
	
}
}