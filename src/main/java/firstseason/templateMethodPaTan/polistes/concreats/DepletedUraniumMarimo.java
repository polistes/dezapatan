package templateMethodPaTan.polistes.concreats;

import templateMethodPaTan.polistes.abstracts.AbstractMarimo;

/**
 * 劣化ウランのマリモは大きくなれるけど、成長速度が遅い。
 **/
public class DepletedUraniumMarimo extends AbstractMarimo {
	
	public DepletedUraniumMarimo(String name, int base){
		super(name, base);
	}

	@Override
	protected void setMaxSize() {
		this.maxSize = base * 10;
	}

	@Override
	protected void setGrowSpeed() {
		this.growSpeed = base / 10;
	}

}
