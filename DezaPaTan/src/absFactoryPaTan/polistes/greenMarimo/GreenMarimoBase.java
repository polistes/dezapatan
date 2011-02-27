package absFactoryPaTan.polistes.greenMarimo;

import absFactoryPaTan.polistes.interfaces.MarimoBase;

public class GreenMarimoBase extends MarimoBase{

	public GreenMarimoBase() {
		this.material = "Moss";
		this.softness = 100;
	}
	
	@Override
	public String getMaterialName() {
		return this.material;
	}

	@Override
	public double getSoftness() {
		return softness;
	}

}
