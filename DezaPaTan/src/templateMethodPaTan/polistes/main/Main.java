package templateMethodPaTan.polistes.main;

import templateMethodPaTan.polistes.concreats.DepletedUraniumMarimo;
import templateMethodPaTan.polistes.concreats.MossMarimo;

public class Main {
	public static void main(String[] args) {
		MossMarimo moss = new MossMarimo("Marina", 50);
		for(int i = 0 ; i < 10 ; i++){
			moss.grow();
		}
		
		DepletedUraniumMarimo golden = new DepletedUraniumMarimo("Marianne", 50);
		for(int i = 0 ; i < 100 ; i++){
			golden.grow();
		}
	}
}
