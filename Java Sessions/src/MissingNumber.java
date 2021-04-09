package Question;

public class MissingNumber {

	public static void main(String[] args) {
		
//		String str= "12459";
//		char missingNum= '1';
//		
//		String result= "";
//		
//		for(int i=0; i<str.length();i++) {
//			if(!(str.charAt(i)==missingNum)) {
//				result= result+ missingNum;
//				i--;
//			}
//			
//			missingNum++;
//		}
//		System.out.println(result);
		
		String s="qw567kzp";
		char ch[] = s.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				System.out.println(ch[i]);
			}
		}
	}

}
