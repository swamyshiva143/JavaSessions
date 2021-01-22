package Practice;

public class CalbyValCalbyRef {
	int p;
	int q;

	public static void main(String[] args) {
		CalbyValCalbyRef obj=new CalbyValCalbyRef();
		
		int x=10;
		int y=20;
		obj.testrun(x, y);		//call by value or pass by value
		
		obj.p=50;
		obj.q=60;
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		obj.swamy(obj);
		//after swap

		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	public int testrun(int a, int b) {
			a=30;
			b=40;
		int c=a+b;
		
		return c;
	}

		public void swamy(CalbyValCalbyRef t) {		//call by reference
			int temp;
			temp=t.p;
			t.p=t.q;
			t.q=temp;
			
			
		}
}
