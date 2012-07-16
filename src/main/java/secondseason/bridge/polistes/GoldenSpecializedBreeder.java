package secondseason.bridge.polistes;

public class GoldenSpecializedBreeder extends MarimoBreeder{
	@Override
	public int createNormalMarimo() {
		return bt.expandNormal( 4 );
	}
	
	@Override
	public int createGoldenMarimo() {
		return bt.expandGolden( 2 );
	}
}
