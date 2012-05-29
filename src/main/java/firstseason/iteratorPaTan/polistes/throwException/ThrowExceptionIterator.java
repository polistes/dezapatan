package iteratorPaTan.polistes.throwException;

import iteratorPaTan.polistes.concreateClasses.Aquarium;
import iteratorPaTan.polistes.concreateClasses.Marimo;
import iteratorPaTan.polistes.interfaces.IteratorTan;

public class ThrowExceptionIterator implements IteratorTan<Marimo>{
	private Aquarium aquarium;
	private int index;

	public ThrowExceptionIterator(Aquarium aquarium) {
		this.aquarium = aquarium;
		index = 0;
	}

	public boolean hasNext() {
		// ダミー
		return false;
	}

	public Marimo getNext() {
		Marimo marimo = aquarium.getMarimo(index++);
		if(marimo == null){
			// 適当にエラーを返す。
			throw new ArrayIndexOutOfBoundsException();
		}
		return marimo;
	}

	public Marimo next() {
		// ダミー
		return null;
	}

	public void remove() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
