package iteratorPaTan.polistes.concreateClasses;

import java.util.Iterator;

import iteratorPaTan.polistes.interfaces.AggregatorTan;
import iteratorPaTan.polistes.interfaces.IteratorTan;


/**
 * 集積用のクラス。Aggregator
 * マリモをたくさん集めるクラス。
 **/
public class Aquarium implements AggregatorTan<Marimo> {

	// 実際に貯める場所。
	private Marimo[] marimos;
	private int marimoNum;

	public Aquarium(int maxSize){
		this.marimos = new Marimo[maxSize];
		this.marimoNum = 0;
	}

	public void setMarimo(Marimo marimo){
		if(marimoNum < marimos.length){
			marimos[marimoNum++] = marimo;
		}
	}

	public Marimo getMarimo(int i){
		if(0 <= i && i < marimoNum){
			return marimos[i];
		}else{
			return null;
		}
	}

	public int getMarimoNum(){
		return marimoNum;
	}

	/* (非 Javadoc)
	 * @see iteratorPaTan.interfaces.AggregatorTan#getIterator()
	 * AggregatorTanのメソッド
	 * ItaratorTanインターフェイスを実装したクラスを返す。
	 */
	public IteratorTan<Marimo> getIterator() {
		return new MarimoIteratorTan(this);
	}

	public Iterator<Marimo> iterator() {
		// TODO 自動生成されたメソッド・スタブ
		return getIterator();
	}

}
