package compositePaTan.polistes.domino;

public class Main {
	public static void main(String[] args) {
		NormalDomino one = new NormalDomino();
		NormalDomino two = new NormalDomino();
		NormalDomino three = new NormalDomino();
		PargeDomino four = new PargeDomino();
		NormalDomino five1 = new NormalDomino();
		NormalDomino five2 = new NormalDomino();

		one.addNext(two);
		two.addNext(three);
		three.addNext(four);
		four.addNext(five1);
		four.addNext(five2);

		one.pushNext();
	}
}
