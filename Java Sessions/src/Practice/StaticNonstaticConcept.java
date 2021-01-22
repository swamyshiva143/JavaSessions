package Practice;

public class StaticNonstaticConcept{

String name="SWAMY";
static int age=28;

public static void main(String[] args){

System.out.println(age);

System.out.println(StaticNonstaticConcept.age);

Gajwel(1);		//static methods.....direct calling
Siddipet(2);

StaticNonstaticConcept.Gajwel(1);	//static methods... using class name

StaticNonstaticConcept.Siddipet(2);

StaticNonstaticConcept obj= new StaticNonstaticConcept();
obj.Hyd(1);			//non static methods using object obj....only
obj.Delhi(1,2);

System.out.println(obj.name);

}
public static void Gajwel(int a){

System.out.println("Gajwel Method");
}
public static void Siddipet(int a){

System.out.println("Siddipet Method");
}


public void Hyd(int a){

System.out.println("Hyd Method");
}

public void Delhi(int a, int b){

System.out.println("Delhi method");
}
}