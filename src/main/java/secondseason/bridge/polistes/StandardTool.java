package secondseason.bridge.polistes;

import java.util.ArrayList;
import java.util.List;

public class StandardTool implements BreedingTool{

	public List<Marimo> createNormalMarimo(MarimoBreeder mb) {
		List<Marimo> marimos = new ArrayList<Marimo>();
		for (int i = 0 ; i < mb.creatableNormalMarimoNum() ; i++) {
			marimos.add(new Marimo());
		}
		return marimos;
	}

	public List<GoldenMarimo> createGoldenMarimo(MarimoBreeder mb) {
		List<GoldenMarimo> marimos = new ArrayList<GoldenMarimo>();
		for (int i = 0 ; i < mb.creatableGoldenMarimoNum() ; i++) {
			marimos.add(new GoldenMarimo());
		}
		return marimos;
	}
	
}
