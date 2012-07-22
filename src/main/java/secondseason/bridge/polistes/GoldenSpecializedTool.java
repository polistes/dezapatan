package secondseason.bridge.polistes;

public class GoldenSpecializedTool implements BreedingTool{

	public int expandNormal(int i) {
		return i / 5;
	}

	public int expandGolden(int i) {
		return i * 2;
	}

}
