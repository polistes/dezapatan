package iteratorPaTan.polistes.throwException;

import iteratorPaTan.polistes.concreateClasses.Aquarium;
import iteratorPaTan.polistes.concreateClasses.Marimo;
import iteratorPaTan.polistes.interfaces.IteratorTan;

public class ReturnNullIterator implements IteratorTan<Marimo>{
	private Aquarium aquarium;
	private int index;

	public ReturnNullIterator(Aquarium aquarium) {
		this.aquarium = aquarium;
		index = 0;
	}

	public boolean hasNext() {
		// ダミー
		return false;
	}

	public Marimo getNext() {
		/**
		 * Aquarium側で範囲外を参照している場合はnullを返すようになっているため、
		 * それをそのまま利用した実装
		 */
		return aquarium.getMarimo(index++);
	}

	public Marimo next() {
		// ダミー
		return getNext();
	}

	public void remove() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
