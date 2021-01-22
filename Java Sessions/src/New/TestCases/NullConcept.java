package New.TestCases;

public class NullConcept {
	
	static Object obj;
	static String str;
	static NullConcept nc;

	public static void main(String[] args) {
//		
//		//1.Case sensitive
//		Object obj=null;
//		
//		//2.Default references will be null
//		System.out.println(obj);
//		System.out.println(str);
//		System.out.println(nc);
//
//		//3.Wrapper Class
//		Integer i=null;
//		int j=i;
//		System.out.println(i);
//		
//		String ds=null;
//		Double d=null;
//		Boolean b=null;
//		Character c=null;
//		
//		String s=null;
//		System.out.println(s);
//
//		//4.static vs non static
//		NullConcept obj= null;
//		obj.send();
//		obj.sum();
//
//		//5.TypeCasting
//		
//		Integer i= (Integer) null;
//		System.out.println(i+"200");
//		
//		String s1=(String) null;
//		System.out.println(s1+"SWAM");
//		System.out.println(s1.length());	//NullPointerException
//		System.out.println(s1.charAt(0)); //NullPointerException		
//		
//		//6.Comparing == and !=
//		System.out.println(null==null);
//		System.out.println(null!=null);
//		
//		
//		//instanceof keyword
//		Integer i=null;
//		Integer j=20;
//		System.out.println(j instanceof Integer );
//		System.out.println(i instanceof Integer );
	}
	
	public static void sum() {
		System.out.println("sum...");
	}
	public void send() {
		System.out.println("send...");
	}
}
