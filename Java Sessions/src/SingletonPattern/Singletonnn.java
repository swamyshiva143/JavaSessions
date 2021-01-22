package SingletonPattern;

public class Singletonnn {
	
	private static Singletonnn singleton_instance=null;		
	public String str;
		
	private  Singletonnn() {
		str="Hey Hero Im SwamyShiva Akula";
	}
	public static Singletonnn getInstance() {
		if(singleton_instance==null)
			singleton_instance= new Singletonnn();
		return singleton_instance;		
	}

	public static void main(String[] args) {
		Singletonnn a=Singletonnn.getInstance();
		Singletonnn b=Singletonnn.getInstance();
		Singletonnn c=Singletonnn.getInstance();
		Singletonnn d=Singletonnn.getInstance();
			
		a.str=(a.str).toUpperCase();
		
		System.out.println(a.str);
		System.out.println(b.str);
		System.out.println(c.str);
		System.out.println(d.str);
		
		b.str=(b.str).toLowerCase();
		
		System.out.println(a.str);
		System.out.println(b.str);
		System.out.println(c.str);
		System.out.println(d.str);
		
	}

}
