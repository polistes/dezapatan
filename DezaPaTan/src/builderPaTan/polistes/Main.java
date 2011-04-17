package builderPaTan.polistes;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		Marimo marimo = null;

		System.out.println("*** Moss Marimo");

		Moss moss = new Moss();
		MossMarimoCreator mmc = new MossMarimoCreator(moss);

		Director dir = new Director(mmc);
		try {
			dir.create();
			marimo = mmc.get();
			System.out.println("moss marimo created");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n*** Stone Marimo");

		Stone stone = new Stone();
		StoneMarimoCreator smc = new StoneMarimoCreator(stone);

		dir = new Director(smc);
		try {
			dir.create();
			marimo = smc.get();
			System.out.println("stone marimo created");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
