package decoratorPaTan.isseium;

public class Ninniku extends AbstractTopping {
	public Ninniku(AbstractTopping ramen){
		super.ramen = ramen;
	}

	@Override
	public int getCost() {
		return 100 + ramen.getCost();
	}
}
