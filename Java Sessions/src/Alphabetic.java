package Question;

public class Alphabetic {

	public static void main(String[] args) {
		
		
//		A 
//		A B 
//		A B C 
//		A B C D 
//		A B C D E 
//		A B C D E F 

		int alpha =65;
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i;j++) {
				char ch= (char)(alpha+j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
//			
//		a 
//		a b 
//		a b c 
//		a b c d 
//		a b c d e 
//		a b c d e f 
	int alpha1 =97;
		
		for(int i=0; i<=5; i++) {
			for(int j=0; j<=i;j++) {
				char ch= (char)(alpha1+j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
			

	}

}
