package builderPaTan.polistes;

import java.util.Random;

public class Moss {
	private final boolean containsNail;
	private Marimo marimo;

	public Moss(){
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());

		containsNail = (rand.nextInt(10) == 1) ? true : false;
	}

	public void ballUp(){
		marimo = new Marimo(containsNail, containsNail ? "contains nail" : "no error");
	}

	public boolean containsNail(){
		return containsNail;
	}

	public Marimo getMarimo(){
		return marimo;
	}
}
