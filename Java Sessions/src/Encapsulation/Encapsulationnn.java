package Encapsulation;
public class Encapsulationnn {
	
	private String DufferName;
	
	private int DufferDob;
	
	private int Duffermarks;
	
	private String DufferCollege;
	
	
	public String getName() {
		
		return DufferName;
	}
	
	public String getCollege() {
		
		return DufferCollege;
	}
	
	public int getDob() {
		
		return DufferDob;
	}
	
	public int getmarks() {
		
		return Duffermarks;
	}
	
	public void setName(String peru) {
		DufferName =peru;
	}
	
	public void setmarks(int markulu) {
		
		Duffermarks= markulu;
		
	}
	
	public void setDob(int puttindu) {
		DufferDob= puttindu;
	}
	
	public void setCollege(String badi) {
		
		DufferCollege= badi;
		
	}
}
