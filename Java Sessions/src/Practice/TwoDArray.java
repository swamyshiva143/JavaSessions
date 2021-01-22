package Practice;

public class TwoDArray {

	public static void main(String[] args) {
		
		int i[][]= new int[3][4];
		i[0][0]=10;
		i[0][1]=20;
		i[0][2]=30;
		
		System.out.println(i[0][0]);
		System.out.println(i[0][1]);
		System.out.println(i[0][2]);
		System.out.println(i[0].length);	//size of the column
		System.out.println(i.length);		//size of the row
		
		
		i[1][0]=40;
		i[1][1]=50;
		i[1][2]=60;

		System.out.println(i[1][0]);
		System.out.println(i[1][1]);
		System.out.println(i[1][2]);
		System.out.println(i[1].length);	//size of the column
		System.out.println(i.length);
		
		
		i[2][0]=70;
		i[2][1]=80;
		i[2][2]=90;
		
		System.out.println(i[2][0]);
		System.out.println(i[2][1]);
		System.out.println(i[2][2]);
		System.out.println(i[2].length);	//size of the column
		System.out.println(i.length);
		
		
		System.out.println(i[0][1]);
		System.out.println(i[1][2]);
		System.out.println(i[2][0]);
		System.out.println(i[2][1]);
		System.out.println(i[1][1]);
		System.out.println(i[0][2]);
		System.out.println(i[2][0]);
		System.out.println(i[2][1]);
		
		System.out.println("*******************");
		
		
		//to print all the values of this class...use for loop
		
		for(int row=0;row<i.length;row++) {
		for(int col=0;col<i[0].length;col++) {
				System.out.println(i[row][col]);
				
				
				
			}
		}
		System.out.println("*******************");
		
		String s[][]= new String[4][4];
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		
		s[1][0]="A1";
		s[1][1]="B1";
		s[1][2]="C1";
		s[1][3]="D1";
		
		s[2][0]="A2";
		s[2][1]="B2";
		s[2][2]="C2";
		s[2][3]="D2";
		
		s[3][0]="A3";
		s[3][1]="B3";
		s[3][2]="C3";
		s[3][3]="D3";
		
		System.out.println(s[0][3]);
		System.out.println(s[1][2]);
		System.out.println(s[2][1]);
		System.out.println(s[3][0]);
		System.out.println(s.length);
		System.out.println(s[0].length);
		
		
		//to print all the values==use for loop
		
		for(int t=0;t<s.length;t++) {
			for(int u=0;u<s[0].length; u++) {
				
				System.out.println(s[t][u]);
			}
			
		}
		
	}

}
