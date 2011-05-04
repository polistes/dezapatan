package decoratorPaTan.isseium;

public class Karame extends AbstractTopping {
	public Karame (AbstractRamen ramen){
		super.ramen = ramen;
	}

	@Override
	public int getCost() {
		return 100 + ramen.getCost();
	}

}
