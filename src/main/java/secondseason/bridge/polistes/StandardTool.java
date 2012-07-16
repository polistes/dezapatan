package secondseason.bridge.polistes;

public class StandardTool implements BreedingTool{

	public int expandNormal(int i) {
		return (int) ( i * 1.2 );
	}

	public int expandGolden(int i) {
		return (int) ( i * 1.2 );
	}
	
}
