package compositePaTan.polistes.main;

import compositePaTan.polistes.concreates.Colony;
import compositePaTan.polistes.concreates.Golden;
import compositePaTan.polistes.concreates.Marimo;

public class Main {
	public static void main(String[] args) {
		Colony parent = new Colony("super colony");
		Colony child1 = new Colony("hard colony");
		Colony child2 = new Colony("normal colony");
		Colony gChild = new Colony("ton colony");
		
		gChild.add(new Marimo("Marina", 10));
		
		child2.add(new Golden("Mariko", 30));
		child2.add(new Marimo("Marimi", 20));
		child2.add(gChild);
		
		child1.add(new Marimo("Marika", 40));
		child1.add(new Marimo("Mari", 1));
		
		parent.add(new Golden("Mariannu", 100));
		parent.add(child1);
		parent.add(child2);
		
		System.out.println(parent.toString());
	}
}
