package secondseason.bridge.polistes;


public class BulkBreeder extends MarimoBreeder{
	private MarimoBreeder breeder = new MarimoBreeder();
	private int loop = 1;
	
	@Override
	public void setTool(BreedingTool bt) {
		breeder.setTool(bt);
	}
	
	@Override
	public int createNormalMarimo() {
		int numMarimo = 0;
		for (int i = 0; i < loop ; i++) {
			numMarimo += breeder.createNormalMarimo();
		}
		return numMarimo;
	}

	@Override
	public int createGoldenMarimo() {
		int numMarimo = 0;
		for (int i = 0; i < loop ; i++) {
			numMarimo += breeder.createGoldenMarimo();
		}
		return numMarimo;
	}
	
	public void setLoop(int loop) {
		this.loop = loop;
	}
}
