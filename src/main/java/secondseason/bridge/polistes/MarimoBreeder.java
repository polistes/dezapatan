package secondseason.bridge.polistes;

import java.util.List;

public class MarimoBreeder {
	protected BreedingTool bt;
	public void setTool(BreedingTool bt) {
		this.bt = bt;
	}
	
	public List<Marimo> createNormalMarimo() {
		return bt.createNormalMarimo(this);
	}

	public List<GoldenMarimo> createGoldenMarimo() {
		return bt.createGoldenMarimo(this);
	}
	
	public int creatableNormalMarimoNum() {
		return 10;
	}
	
	public int creatableGoldenMarimoNum() {
		return 1;
	}
}
