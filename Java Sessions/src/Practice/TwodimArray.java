package Practice;

public class TwodimArray{

public static void main(String[] args){

String s[][]= new String[3][3];
s[0][0]="AMMA";
s[0][1]="NANNA";
s[0][2]="ILOVEYOU";

s[1][0]="Swamy";
s[1][1]="Shiva";
s[1][2]="Akula";

s[2][0]="Akka";
s[2][1]="Chelli";
s[2][2]="Bava";


System.out.println(s[0][2]);
System.out.println(s[1][1]);
System.out.println(s[2][1]);
System.out.println(s[0][0]);
System.out.println(s.length);
System.out.println(s[0].length);
System.out.println(s[0][0]+s[1][0]+s[2][1]);


for(int i=0;i<s.length;i++){
for(int j=0; j<s[0].length;j++){
System.out.println(s[i][j]);
}
}
}
}

