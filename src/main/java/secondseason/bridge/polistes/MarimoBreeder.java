package secondseason.bridge.polistes;

public class MarimoBreeder {
	protected BreedingTool bt;
	public void setTool(BreedingTool bt) {
		this.bt = bt;
	}
	
	public int createNormalMarimo() {
		return bt.expandNormal( 10 );
	}

	public int createGoldenMarimo() {
		return bt.expandGolden( 1 );
	}
}
