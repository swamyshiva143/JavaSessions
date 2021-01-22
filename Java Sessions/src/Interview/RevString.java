package Interview;

public class RevString {

	public static void main(String[] args) {

		String g= "Hello World";
		
		int l=g.length();
		String rev="";
		
		for(int i=l-1; i>=0; i--) {
			rev=rev+g.charAt(i);
			
		}
		System.out.println(rev);
		
		
		StringBuffer sb= new StringBuffer(g);
		System.out.println(sb.reverse());
				
	}

}
