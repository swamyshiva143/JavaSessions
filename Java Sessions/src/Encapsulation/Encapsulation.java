package Encapsulation;
public class Encapsulation {
	
	private String SwamyName;
	
	private int SwamyRoll;
	
	private int SwamyAge;
	
	
	public String getName() {
		return SwamyName;
		
		}
	
	public int getAge() {
		
		return SwamyAge;
	}
	
	public int getRoll() {
		
		return SwamyRoll;
	}
	
	public void setName(String newName) {
		
		SwamyName= newName;
	}
	
	public void setRoll(int newRoll) {
		
		SwamyRoll= newRoll;
	}
	
	public void setAge(int newAge) {
		
		SwamyAge= newAge;
	}
	

}
