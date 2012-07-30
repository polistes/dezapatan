package secondseason.bridge.polistes;

import java.util.Collections;
import java.util.List;

public class GoldenSpecializedTool implements BreedingTool{

	public List<Marimo> createNormalMarimo(MarimoBreeder mb) {
		return Collections.nCopies(
				mb.creatableNormalMarimoNum()/5,
				new Marimo());
	}

	public List<GoldenMarimo> createGoldenMarimo(MarimoBreeder mb) {
		return Collections.nCopies(
				mb.creatableGoldenMarimoNum()*2,
				new GoldenMarimo()); 
	}
}
