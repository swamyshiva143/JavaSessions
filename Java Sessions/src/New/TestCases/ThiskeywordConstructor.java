package New.TestCases;

public class ThiskeywordConstructor {
	String name;
	int age;
	
	String father;
	String mother;
	int age1;
	int age2;
	
	String sister1;
	String sister2;
	String bava1;
	String bava2;
	
	double weight;
	double height;
	boolean result;
	
	ThiskeywordConstructor(String father, String mother, String name, String sister1, String sister2){
		this.father=father;
		this.mother=mother;
		this.name=name;
		this.sister1=sister1;
		this.sister2=sister2;
		
		System.out.println(father);
		System.out.println(mother);
		System.out.println(name);
		System.out.println(sister1);
		System.out.println(sister2);
	}
	
	
	  ThiskeywordConstructor(double weight, double height, boolean result, String bava1, String bava2){
		this.weight=weight;
		this.height=height;
		this.result=result;
		this.bava1=bava1;
		this.bava2=bava2;
		
		System.out.println(weight);
		System.out.println(height);
		System.out.println(result);
		System.out.println(bava1);
		System.out.println(bava2);
		
	}
	
	ThiskeywordConstructor(String name, int age){
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
		}

	ThiskeywordConstructor(String father, boolean result){
		this.father=father;
		this.result=result;
		
		System.out.println(father);
		System.out.println(result);
		}
	
	ThiskeywordConstructor(String father, String mother, int age1, int age2){
		this.father=father;
		this.mother=mother;
		this.age1=age1;
		this.age2=age2;
		
		System.out.println(father);
		System.out.println(mother);
		System.out.println(age1);
		System.out.println(age2);
	}
	
	ThiskeywordConstructor(String sister1, String sister2){
		this.sister1=sister1;
		this.sister2=sister2;
		
		System.out.println(sister1);
		System.out.println(sister2);
	}

	public static void main(String[] args) {
		ThiskeywordConstructor obj= new ThiskeywordConstructor("SWAMY", 28);
		ThiskeywordConstructor obj1= new ThiskeywordConstructor("narayana","yashoda",60, 55);
		ThiskeywordConstructor obj2= new ThiskeywordConstructor("Balamani", "LAvanya");
		ThiskeywordConstructor obj3= new ThiskeywordConstructor(70.5, 162.6, true, "Shankar", "Ravinder");
		ThiskeywordConstructor hel= new ThiskeywordConstructor("narayana","yashoda","Swamy","Balamani","Lavanya");
		ThiskeywordConstructor ob= new ThiskeywordConstructor("SWAMY", false);
	}

}
