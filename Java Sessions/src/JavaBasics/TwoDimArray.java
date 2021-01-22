package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
	
		String y[][]= new String[3][4];
		
		System.out.println(y.length);
		System.out.println(y[0].length);

		y[0][0]= "A";
		y[0][1]= "B";
		y[0][2]= "C";
		y[0][3]= "D";

		y[1][0]= "A1";
		y[1][1]= "B1";
		y[1][2]= "C1";
		y[1][3]= "D1";

		y[2][0]= "A2";
		y[2][1]= "B2";
		y[2][2]= "C2";
		y[2][3]= "D2";
		
		System.out.println(y[0][2]);
		System.out.println(y[1][1]);
		System.out.println(y[2][2]);
		
		for(int row=0;row<y.length;row++){
			for(int column=0;column<y[0].length;column++){

			System.out.println(y[row][column]);
			}
		}
			
	}

}
