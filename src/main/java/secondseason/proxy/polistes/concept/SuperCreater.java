package secondseason.proxy.polistes.concept;

public class SuperCreater implements Creater {
	
	public SuperCreater() {
		try {
			System.out.println("yes, I'm a Super Creater!");
			Thread.sleep(5000);
		} catch (InterruptedException e) { }
	}

	public Marimo createNormalMarimo(String name) {
		try {
			System.out.println("what a silly work...");
			Thread.sleep(5000);
		} catch (InterruptedException e) { }
		return new Marimo(name);
	}

	public Marimo createSuperMarimo(String name) {
		try {
			System.out.println("oh...");
			Thread.sleep(5000);
			System.out.print("hmmm...");
			Thread.sleep(5000);
			System.out.println("YES!");
		} catch (InterruptedException e) { }
		return new Marimo("*" + name + "*");
	}

}
