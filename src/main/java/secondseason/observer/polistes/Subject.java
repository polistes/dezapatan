package secondseason.observer.polistes;


import java.util.ArrayList;

import secondseason.observer.polistes.Marimo.STATE;



/**
 * オブザーバー周りの操作はほとんど固定なので、テンプレートメソッドパターンで隠ぺい
 * ・・・あれ、テンプレートだっけこれ
 * 
 * オブザーバーの情報をコピーするためにプロトタイプパターンを利用
 * → Cloneable
 */
public abstract class Subject implements Cloneable{
	private ArrayList<オブザーバたん> observers =
			new ArrayList<オブザーバたん>();

	public void addObserver(オブザーバたん obs){
		observers.add(obs);
	}

	public void notifyObservers(Marimo marimo, STATE state){
		for (オブザーバたん obs : observers) {
			obs.notify(marimo, state);
		}
	}

	@Override
	protected Object clone(){
		// オブザーバーの情報をコピー
		Marimo clone = new Marimo();
		for (オブザーバたん obs : observers) {
			clone.addObserver(obs);
		}
		return clone;
	}
}
