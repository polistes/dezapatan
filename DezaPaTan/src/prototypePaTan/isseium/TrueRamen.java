package prototypePaTan.isseium;

public class TrueRamen implements Cloneable {
	/* prototype に焦点をあわせるため、どうでもいいところは簡略化しています。本来はもっとうまくやるべき */
	private String men;
	private TrueSoup soup;
	
	
	public void setMen(String men){
		this.men = men;
	}
	
	public void setSoup(TrueSoup soup){
		this.soup = soup;
	}
	
	public void setShio(){
		this.soup.setSoupType("しお");
	}
	
	public void setMiso(){
		this.soup.setSoupType("みそ");
	}
	
	public void printRamen(){
		System.out.println("Men : " + men);
		System.out.println("Soup: " + soup.getSoupType());
	}
	
	public Object clone() throws CloneNotSupportedException {
		TrueRamen copy = (TrueRamen) super.clone();
		copy.setSoup((TrueSoup) soup.clone());
		return copy;
	}
}
