package SingletonPattern;

public class SingletonPattern {
	
	private static SingletonPattern singleton_instance=null;
	public int i,j;
	boolean b;
	String ring;
	
	
	
	private SingletonPattern() {
		i=120120;
		j=123123;
		b=true;
		ring="Loude Ke Ball Nayalaaa";
		
	}
	
	public static SingletonPattern getInstance() {
		if(singleton_instance==null);
		singleton_instance = new SingletonPattern();
		return singleton_instance;
		
	}

	public static void main(String[] args) {
		SingletonPattern x=SingletonPattern.getInstance();
		SingletonPattern y=SingletonPattern.getInstance();
		
		x.i=(x.i);
		x.j=(x.j);
		x.b=(x.b);
		x.ring=(x.ring).toUpperCase();
		
		
		
		System.out.println(x.i);
		System.out.println(x.j);
		System.out.println(x.b);
		System.out.println(x.ring);
		
		
		y.i=(y.i);
		y.j=(y.j);
		y.ring=(y.ring).toLowerCase();
		
		System.out.println(y.i);
		System.out.println(y.j);
		System.out.println(y.ring);

	}

}
