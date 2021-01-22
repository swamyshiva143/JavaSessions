package JavaBasics;

public class arrayint {

	public static void main(String[] args) {
	
		int i[]= new int[4];
			i[0]=100;
			i[1]=200;
			i[2]=300;
			i[3]=400;
			
		System.out.println(i[3]);
		System.out.println(i[2]);
		System.out.println(i[1]);
		System.out.println(i.length);//size or length of array
		
		for(int j=0;j<i.length;j++) {//for loop for all the values
		System.out.println(i[j]);
		}
	}
	

}
