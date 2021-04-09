package Question;

public class CountOccurance {

	public static void main(String[] args) {
	
		String str= "I love coding and testing,  i am happy";
		//I=1	//i=3		//g=2
		//CharArray---for loops
		//str.length--charAt(i)
		//Streams
		//Apache Common StringUtils-- External Jar file has to download and add to library
		
		getCharCount(str, 'g');
		getCharOccurance(str, 'i');
		getCharUsingStreams(str, "p");
		
		//int count= StringUtils.countMatches(str, "g");
		//System.out.println(count);
	}

	
	public static void getCharUsingStreams(String str, String val) {
		long count=str.chars().mapToObj(e-> String.valueOf((char) e)).filter(e->e.equals(val)).count();
		System.out.println(val+ ":"+count);
		
	}
	public static void getCharOccurance(String str, char val) {
		
		int count=0;
		for(char ch: str.toCharArray()) {
			if(ch==val) {
				count++;
			}
		}
		System.out.println(val+":"+count);
		
	}
	public static void getCharCount(String str, char val) {
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==val) {
				count++;
			}
		}
		System.out.println(val + ":" + count);
	}
	
	
}
