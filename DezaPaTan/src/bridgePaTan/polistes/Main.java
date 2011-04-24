package bridgePaTan.polistes;

public class Main {
	public static void main(String[] args) {
		ElementExtractor fuelExtractor = new FuelExtractor();
		ElementExtractor goldExtractor = new GoldExtractor();

		/**
		 * 基本動作の紹介
		 */
		System.out.println("***** 燃料を抽出できるマリモ");
		ExtractableMarimo marimo = new ExtractableMarimo(fuelExtractor);
		System.out.println("extract : " + marimo.extract());
		System.out.println();

		/**
		 * 実装の階層を分離することで、動作を変更可能
		 */
		System.out.println("***** Extractorを変更することで金を取得できる");
		marimo = new ExtractableMarimo(goldExtractor);
		System.out.println("extract : " + marimo.extract());
		System.out.println();

		/* ここまでだったらBuilderクラスと同じクラス図になるような!? */

		/**
		 * 機能の階層を分離することで、拡張機能を持ったクラスでも
		 * 上記で利用していたExtractorをそのまま利用できる。
		 */
		System.out.println("***** マリモを継承したでっかいマリモを利用することで抽出量アップ");
		marimo = new LargeExtractableMarimo(goldExtractor);
		System.out.println("extract : " + marimo.extract());

	}
}
