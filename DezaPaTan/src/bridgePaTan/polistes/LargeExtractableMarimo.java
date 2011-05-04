package bridgePaTan.polistes;

/**
 * 基本クラスであるExtractableMarimoを継承することで、拡張機能を持ったサブクラスを作成。
 * それでもExtractorはそのまま利用することができる。
 */
public class LargeExtractableMarimo extends ExtractableMarimo {

	public LargeExtractableMarimo(ElementExtractor extractor) {
		super(extractor);
	}

	/**
	 * 抽出量が5倍に。
	 */
	@Override
	public int getSize() {
		return 5;
	}
}
