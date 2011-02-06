package iteratorPaTan.polistes.interfaces;


/**
 * オブジェクトを集積するためのインターフェイス。
 * IteratorTanを取得できるようにする。
 *
 **/
public interface AggregatorTan<E> extends Iterable<E>{
	public IteratorTan<E> getIterator();
}
