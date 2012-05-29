package decoratorPaTan.isseium;

public class Yasai extends AbstractTopping {
	public Yasai(AbstractRamen ramen){
		super.ramen = ramen;
	}

	@Override
	public int getCost() {
		return 100 + ramen.getCost();
	}

}
