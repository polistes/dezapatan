package templateMethodPaTan.polistes.concreats;

import templateMethodPaTan.polistes.abstracts.AbstractMarimo;

/**
 * 苔のマリモは成長速度が速いけど、すぐ壊れる
 **/
public class MossMarimo extends AbstractMarimo{
	
	public MossMarimo(String name, int base) {
		super(name, base);
	}

	@Override
	protected void setMaxSize() {
		this.maxSize = base * 2;
	}

	@Override
	protected void setGrowSpeed() {
		this.growSpeed = base / 5;
	}

}
