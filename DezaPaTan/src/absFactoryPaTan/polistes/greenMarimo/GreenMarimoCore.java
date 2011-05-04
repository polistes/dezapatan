package absFactoryPaTan.polistes.greenMarimo;

import absFactoryPaTan.polistes.interfaces.MarimoCore;

public class GreenMarimoCore extends MarimoCore {
	public GreenMarimoCore() {
		this.material = "Moss";
		this.hardness = 30;
	}

	@Override
	public String getMaterialName() {
		return material;
	}

	@Override
	public double getHardness() {
		return hardness;
	}
	

}
