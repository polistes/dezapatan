package iteratorPaTan.polistes.interfaces;

import java.util.Iterator;

/**
 * Iteratorパターンの根幹？
 * まだ取り出せるものがあるかを返すhasNextメソッドと
 * 実際にオブジェクトを取り出すgetNextメソッドを定義
 * getNextという名前にしたのは個人的な趣味。
 **/
public interface IteratorTan<E> extends Iterator<E>{
	public boolean hasNext();
	public E getNext();
}
