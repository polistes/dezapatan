package secondseason.observer.polistes;

import java.util.Random;

public class Marimo extends Subject
		implements Runnable {
	private String name;
	private static Random RAND = 
			new Random(System.currentTimeMillis());
	public enum STATE {
		ADDITION, EXTINCTION
	}

	public void run() {
		// ここに記述するのは間違ってる気する。
		// でもクローンを考えるとコンストラクタには記述でできないような。
		// うーん？
		notifyObservers(this, STATE.ADDITION);

		try {
			while (true) {
				Thread.sleep(RAND.nextInt(5000));
				// クローンを作成することで、Observerの設定をコピー
				Marimo child = (Marimo) this.clone();
				child.setName(getName() + " child");
				// 子供のスレッドを実行する → OutOfMemmory！
				Thread childThread = new Thread(child);
				childThread.start();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
