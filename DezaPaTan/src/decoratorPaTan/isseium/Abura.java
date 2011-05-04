package decoratorPaTan.isseium;

public class Abura extends AbstractTopping {
	public Abura (AbstractRamen ramen){
		super.ramen = ramen;
	}

	@Override
	public int getCost() {
		return 70 + ramen.getCost();
	}

}
