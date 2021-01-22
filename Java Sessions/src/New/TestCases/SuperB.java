package New.TestCases;

public class SuperB extends SuperA {
	
	public SuperB() {
		super();
	}
	public SuperB(int i) {
		super(i);
	}
	public SuperB(int i, int j) {
		super(i,j);
	}
	public SuperB(int i, int j, int k) {
		super(i,j,k);
	}

	public static void main(String[] args) {
		SuperB obj=new SuperB();
		SuperB obj1=new SuperB(10);
		SuperB obj2=new SuperB(20,30);
		SuperB obj3=new SuperB(100,200,300);
	}

}
