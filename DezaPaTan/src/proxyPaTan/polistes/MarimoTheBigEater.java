package proxyPaTan.polistes;

public class MarimoTheBigEater implements MarimoTheEater{

	public MarimoTheBigEater() {
		System.out.println("ポフゥ");
		try { Thread.sleep(1000); } catch (Exception e) { }
	}
	
	public void eatBeaf() {
		System.out.println("牛肉キタコレ");
		try { Thread.sleep(1000); } catch (Exception e) { }
	}

	public void eatPork() {
		System.out.println("豚肉でござるよ！豚肉！");
		try { Thread.sleep(1000); } catch (Exception e) { }
	}

	public void eatFish() {
		System.out.println("今回は魚か…");
		try { Thread.sleep(1000); } catch (Exception e) { }
	}

}
