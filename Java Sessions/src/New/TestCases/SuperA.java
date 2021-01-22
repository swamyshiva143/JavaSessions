package New.TestCases;

public class SuperA {
	
	public SuperA(){
		System.out.println("parent class constr");
	}
	public SuperA(int i){
		System.out.println("one parameter constr with value of i:"+i);
	}
	public SuperA(int i, int j){
		System.out.println("two parameter constr with value of i:"+i);
		System.out.println("two parameter constr with value of j:"+j);
	}


	public SuperA(int i, int j, int k){
		int l=i+j+k;
		System.out.println("two parameter constr with value of i:"+i);
		System.out.println("two parameter constr with value of j:"+j);
		System.out.println("two parameter constr with value of k:"+k);
		System.out.println("two parameter constr with value of l:"+l);
	}

}
