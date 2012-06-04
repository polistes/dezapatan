package secondseason.proxy.polistes.concept;

public class Marimo {
	private String name;

	public Marimo(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
