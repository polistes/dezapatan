package bridgePaTan.polistes;

/**
 * Bridgeパターン。
 * 機能の階層と、実装の階層を分離するためのパターン。
 *
 * 機能の階層とは継承によって新たなメソッドを追加することを指し、
 * 実装の階層とは実行するメソッドを、インターフェイスに分離することによって切り替えを可能にすることを指す。
 *
 * ちょっと何言ってるのかわからない。
 *
 * この例では
 * 成長に合わせて土壌から物質を抽出して蓄えることができるマリモを作成することで説明。
 * このクラスが全体の基盤となる普通の抽出マリモ。
 *
 */
public class ExtractableMarimo {
	protected ElementExtractor extractor;

	public ExtractableMarimo(ElementExtractor extractor){
		this.extractor = extractor;
	}

	// 抽出したものを教えてくれる
	public String extract(){
		return extractor.getElementName() + "(" + extractor.getAmount() * getSize() + " g)";
	}

	// マリモの大きさ
	public int getSize(){
		return 1;
	}
}
