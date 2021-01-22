package Practice;

public class ArrayConcept {

	public static void main(String[] args) {
		// data structure which can store a fixed size collections of elements of the same data type.
		//called static array..to over come use object array
		//int array

		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i.length);
		System.out.println(i[0]+i[1]+i[2]+i[3]);
		
		// double array
		
		double d[]= new double[5];
		d[0]=1.11;
		d[1]=2.22;
		d[2]=3.33;
		d[3]=4.44;
		d[4]=5.55;
		
		System.out.println(d.length);
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		System.out.println(d[0]+d[3]+d[4]);
		
		
		//char array
		
		char c[]= new char[3];
		c[0]='0';
		c[1]='A';
		c[2]='$';
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c.length);
		
		
		//boolean array
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b.length);
		
		
		// string array
		
		String s[]= new String[3];
		s[0]="SWAMY";
		s[1]="SHIVA";
		s[2]="AKULA";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[0]+s[1]+s[2]);
		
		
		//object array ===super class of all classes
		
		Object ob[]= new Object[6];
		ob[0]="SWAMYSHIVA";
		ob[1]='M';
		ob[2]="02/11/1992";
		ob[3]=162;
		ob[4]=56.55;
		ob[5]=28;
		
		System.out.println(ob.length);
		System.out.println(ob[0]);
		System.out.println(ob[1]);
		System.out.println(ob[2]);
		System.out.println(ob[3]);
		System.out.println(ob[4]);
		System.out.println(ob[5]);
		
		System.out.println("*******************");
		//to print all the values use for loop
		
		for(int j=0;j<ob.length;j++) {
			System.out.println(ob[j]);
		}
		
		
		
	}

}
