package prototypePaTan.isseium;

public class Ramen implements Cloneable {
	/* prototype に焦点をあわせるため、どうでもいいところは簡略化しています。本来はもっとうまくやるべき */
	private String men;
	private Soup soup;
	
	
	public void setMen(String men){
		this.men = men;
	}
	
	public void setSoup(Soup soup){
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
		return super.clone();
	}
}
