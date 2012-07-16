package secondseason.bridge.polistes;

public class GoldenSpecializedTool implements BreedingTool{

	public int expandNormal(int i) {
		return i;
	}

	public int expandGolden(int i) {
		return (int)(i * 1.75);
	}

}
