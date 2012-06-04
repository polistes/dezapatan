package secondseason.proxy.polistes.virtual;

import java.util.ArrayList;
import java.util.List;

import secondseason.proxy.polistes.concept.Marimo;

/**
 * できる限りオブジェクトの生成を遅延させるプロキシパターン
 */
public class VirtualProxy {
	
	/**
	 * インターフェイス。
	 * マリモの名前だけ指定して、セットするメソッドと
	 * マリモの入ったコレクションを取得するためのメソッドがある
	 */
	public interface Creater {
		public void createAndSetMarimo(String name);
		public List<Marimo> createAquarium();
	}

	/**
	 * 必要になるまでオブジェクトを生成しないプロキシクラス。
	 */
	public static class VircualCreater implements Creater{
		// 名前の状態で保持
		private String virtualMarimo;
		
		// 実際にオブジェクトを生成するクラス
		private RealCreater rc;
		
		public void createAndSetMarimo(String name) {
			System.out.println("set name : " + name);
			this.virtualMarimo = name;
		}

		public List<Marimo> createAquarium() {
			// 生成するタイミングになったら生成クラスを作成
			if (rc == null) rc = new RealCreater();
			rc.createAndSetMarimo(virtualMarimo);
			
			return rc.createAquarium();
		}
	}
	
	/**
	 * 実際にオブジェクトを生成するクラス
	 */
	public static class RealCreater implements Creater{
		// マリモの状態で保持
		private Marimo marimo;
		
		public void createAndSetMarimo(String name) {
			System.out.println("created Marimo : " + name);
			this.marimo = new Marimo(name);
		}

		public List<Marimo> createAquarium() {
			// コレクションを作成して返す。
			ArrayList<Marimo> aquarium = new ArrayList<Marimo>();
			aquarium.add(marimo);
			System.out.println("created Aquarium");
			return aquarium;
		}
	}
	
	public static void main(String[] args) {
		Creater c1 = new VircualCreater();
		c1.createAndSetMarimo("マリアンヌ");
		c1.createAquarium();
		
		Creater c2 = new VircualCreater();
		c2.createAndSetMarimo("マリ太");
		// アクアリウムは作成しない
//		c2.createAquarium();
	}
}
 