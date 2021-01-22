package SingletonPattern;

public class SingletonClass{

private static SingletonClass singleton_instance=null;

public String str;

private SingletonClass(){

str=("Oh My God what the hell is going on in My Life");
}

public static SingletonClass getInstance(){
if(singleton_instance==null)
singleton_instance= new SingletonClass();
return singleton_instance;
}

public static void main(String[] args){

SingletonClass i= SingletonClass.getInstance();
SingletonClass j= SingletonClass.getInstance();
SingletonClass k= SingletonClass.getInstance();

i.str=(i.str).toUpperCase();

System.out.println(i.str);
System.out.println(j.str);
System.out.println(k.str);


j.str=(j.str).toLowerCase();

System.out.println(i.str);
System.out.println(j.str);
System.out.println(k.str);

k.str=(k.str).toUpperCase();

System.out.println(i.str);
System.out.println(j.str);
System.out.println(k.str);

}
}
