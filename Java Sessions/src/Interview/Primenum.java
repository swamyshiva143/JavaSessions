package Interview;

public class Primenum{

public static boolean isPrimenum(int num){

if(num<=1){

return false;
}

for(int i=2; i<num; i++){
if(num%i==0){
return false;
}
}
return true;
}

public void getPrimenum(int num){

for(int i=2; i<=num; i++){
if(isPrimenum(i))
System.out.println(i+ "");
}
}
public static void main(String[] args){

System.out.println("2 is Prime:" + isPrimenum(2));
System.out.println("13 is Prime:" + isPrimenum(13));
System.out.println("15 is Prime:" + isPrimenum(15));
System.out.println("57 is Prime:" + isPrimenum(57));

Primenum obj= new Primenum();

obj.getPrimenum(30);
obj.getPrimenum(100000);

}
}