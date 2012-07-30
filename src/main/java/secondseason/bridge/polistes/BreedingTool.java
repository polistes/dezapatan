package secondseason.bridge.polistes;

import java.util.List;

public interface BreedingTool {
	public List<Marimo> createNormalMarimo(MarimoBreeder marimoBreeder);
	public List<GoldenMarimo> createGoldenMarimo(MarimoBreeder marimoBreeder);
}
