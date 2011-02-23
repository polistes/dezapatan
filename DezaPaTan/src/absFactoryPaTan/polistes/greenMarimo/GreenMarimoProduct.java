package absFactoryPaTan.polistes.greenMarimo;

import absFactoryPaTan.polistes.interfaces.MarimoProduct;

public class GreenMarimoProduct extends MarimoProduct {
	public GreenMarimoProduct(String name) {
		super(name);
	}

	@Override
	public void setMarimoBase() {
		this.base = new GreenMarimoBase();
		
		// 成長スピードは主成分の柔らかさに等しい
		this.growSpeed = this.base.getSoftness();
	}
	
	@Override
	public void setMarimoCore() {
		this.core = new GreenMarimoCore();
		
		// 最大サイズはコアの硬さに等しい
		this.maxSize = this.core.getHardness();
	}
}
