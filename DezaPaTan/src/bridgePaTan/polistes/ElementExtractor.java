package bridgePaTan.polistes;


public interface ElementExtractor {
	// 抽出できる物質名を返す
	public String getElementName();

	// 単位日あたりに抽出できる物質の量を返す
	public int getAmount();
}
