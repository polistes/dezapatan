package iteratorPaTan.polistes.concreateClasses;


/**
 * 実行するためのMainメソッドを書いたクラス。
 * 特に何でもよかった
 **/
public class IteratorTanMain {
	public static void main(String[] args) {
		Aquarium aquarium = new Aquarium(10);
		aquarium.setMarimo(new Marimo("Mariko", 4));
		aquarium.setMarimo(new Marimo("Marina", 3));
		aquarium.setMarimo(new Marimo("Mariannu", 50));


		for(Marimo marimo : aquarium){
			marimo.grow();
			System.out.println(marimo.getRecord());
		}


		/*IteratorTan<Marimo> iteratorTan = aquarium.getIterator();
		while(iteratorTan.hasNext()){
			Marimo marimo = iteratorTan.getNext();
			marimo.grow();
			System.out.println(marimo.getRecord());
		}*/



	}
}
