package decoratorPaTan.isseium;

public abstract class AbstractTopping extends AbstractRamen {
	AbstractRamen ramen;

	@Override
	public abstract int getCost();
}
