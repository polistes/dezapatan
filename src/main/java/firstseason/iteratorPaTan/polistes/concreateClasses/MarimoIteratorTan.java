package iteratorPaTan.polistes.concreateClasses;

import iteratorPaTan.polistes.interfaces.IteratorTan;

/**
 * ItaratorTanを実装したクラス
 * AggregatorTanであるAquariumを受け取り、1つずつマリモを取り出す。
 */
public class MarimoIteratorTan implements IteratorTan<Marimo> {
	private Aquarium aquarium;
	private int index;

	public MarimoIteratorTan(Aquarium aquarium) {
		this.aquarium = aquarium;
		index = 0;
	}

	/* (非 Javadoc)
	 * @see iteratorPaTan.interfaces.IteratorTan#hasNext()
	 * IteratorTanのメソッド
	 * まだ取り出せるものがあるかどうかを返す。
	 */
	public boolean hasNext() {
		if(index < aquarium.getMarimoNum()){
			return true;
		}else{
			return false;
		}
	}

	/* (非 Javadoc)
	 * @see iteratorPaTan.interfaces.IteratorTan#getNext()
	 * IteratorTanのメソッド
	 * 次に取り出せるものを取り出す。
	 * ここでhasNextメソッドを呼び出すのはどうなんだろうか？
	 */
	public Marimo getNext() {
		if(hasNext()){
			return aquarium.getMarimo(index++);
		}else{
			return null;
		}
	}

	public Marimo next() {
		return this.getNext();
	}

	public void remove() {
		// TODO 自動生成されたメソッド・スタブ

	}

}
