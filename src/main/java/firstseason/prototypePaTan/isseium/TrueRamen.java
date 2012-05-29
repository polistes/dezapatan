package prototypePaTan.isseium;

public class TrueRamen implements Cloneable {
	/* prototype �ɏœ_�����킹�邽�߁A�ǂ��ł������Ƃ���͊ȗ������Ă��܂��B�{���͂����Ƃ��܂����ׂ� */
	private String men;
	private TrueSoup soup;
	
	
	public void setMen(String men){
		this.men = men;
	}
	
	public void setSoup(TrueSoup soup){
		this.soup = soup;
	}
	
	public void setShio(){
		this.soup.setSoupType("����");
	}
	
	public void setMiso(){
		this.soup.setSoupType("�݂�");
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
