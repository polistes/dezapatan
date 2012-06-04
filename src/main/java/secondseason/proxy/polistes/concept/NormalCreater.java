package secondseason.proxy.polistes.concept;

public class NormalCreater implements Creater {
	private SuperCreater sc;

	public Marimo createNormalMarimo(String name) {
		return new Marimo(name);
	}

	public Marimo createSuperMarimo(String name) {
		if (sc == null) sc = new SuperCreater();
		return sc.createSuperMarimo(name);
	}
}
