package prototypePaTan.isseium;

public class TrueSoup implements Cloneable {
	private String soupType;
	
	public String getSoupType(){
		return soupType;
	}
	
	public void setSoupType(String soupType){
		this.soupType = soupType;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
