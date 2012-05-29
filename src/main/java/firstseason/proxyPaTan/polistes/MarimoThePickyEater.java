package proxyPaTan.polistes;

public class MarimoThePickyEater implements MarimoTheEater{
	private MarimoTheBigEater bigEater;
	
	public void eatBeaf() {
		System.out.println("牛肉食べる");
	}

	public void eatPork() {
		System.out.println("豚肉食べる");
	}

	public void eatFish() {
		System.out.println("魚は嫌い");
		if(bigEater == null){
			bigEater = new MarimoTheBigEater();
		}

		bigEater.eatFish();
	}
	
}
