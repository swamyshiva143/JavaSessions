package JavaBasics;

public class objectarray {

	public static void main(String[] args) {
		
		Object ob[]= new Object[6];
		ob[0]="Swamyshiva";
		ob[1]="27";
		ob[2]="MALE";
		ob[3]="Btech Engineering";
		ob[4]="02/11/1992";
		ob[5]="Siddipet";
		
		System.out.println(ob[0]);
		System.out.println(ob[1]);
		System.out.println(ob[2]);
		System.out.println(ob[3]);
		System.out.println(ob[4]);
		System.out.println(ob[5]);
		System.out.println(ob.length);
		
		for(int j=0;j<ob.length;j++) {
		
			System.out.println(ob[j]);
		}
		

	}

}
