package Practice;

public class CallByValCallByRef{

int p;
int q;

int p1;
int q1;

public static void main(String[] args){
CallByValCallByRef obj= new CallByValCallByRef();
 int x=30;
 int y=40;
int w=obj.swashi(x,y);
System.out.println(w);

obj.p=100;
obj.q=200;
System.out.println(obj.p);
System.out.println(obj.q);

obj.jannu(obj);

System.out.println(obj.p);
System.out.println(obj.q);


obj.p1=450;
obj.q1=550;

System.out.println(obj.p1);
System.out.println(obj.q1);

obj.babloo(obj);
System.out.println(obj.p1);
System.out.println(obj.q1);

int j=888;
int k=999;
int l=777;

int w1=obj.essay(j,k,l);
System.out.println(w1);

}
public int swashi(int a, int b){
a=10;
b=20;
int c= a+b;

return c;

}
public void jannu(CallByValCallByRef x){
int zeal;
zeal=x.p;
x.p=x.q;
x.q=zeal;

}

public void babloo(CallByValCallByRef y) {
	int extra;
	extra=y.p1;
	y.p1=y.q1;
	y.q1=extra;
	

}

public int essay(int u, int v, int w) {
	u=123;
	v=143;
	w=154;
	
	int r= u+v-w;
	 
	return r;
}
}