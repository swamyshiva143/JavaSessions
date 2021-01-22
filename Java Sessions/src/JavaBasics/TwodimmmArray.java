package JavaBasics;

public class TwodimmmArray {

	public static void main(String[] args) {

String x[][]= new String[3][3];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		
		x[1][0]="x";
		x[1][1]="y";
		x[1][2]="z";
		
		x[2][0]="1";
		x[2][1]="2";
		x[2][2]="3";
		
		System.out.println(x[1][2]);
		System.out.println(x[1][0]);
		System.out.println(x[0][2]);
		System.out.println(x[2][0]);
		
		
		for(int row=0; row<x.length; row++) {
		for(int column=0; column<x[0].length; column++) {
			
			System.out.println(x[row][column]);
		}
		}

	}

}
