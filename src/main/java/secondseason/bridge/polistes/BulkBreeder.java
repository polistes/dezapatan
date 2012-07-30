package secondseason.bridge.polistes;

import java.util.ArrayList;
import java.util.List;


public class BulkBreeder extends MarimoBreeder{
	private int loop = 1;
	
	@Override
	public List<Marimo> createNormalMarimo() {
		List<Marimo> marimos = new ArrayList<Marimo>();
		for (int i = 0; i < loop ; i++) {
			for (Marimo m : super.createNormalMarimo()) {
				marimos.add(m);
			}
		}
		return marimos;
	}

	@Override
	public List<GoldenMarimo> createGoldenMarimo() {
		List<GoldenMarimo> marimos = new ArrayList<GoldenMarimo>();
		for (int i = 0; i < loop ; i++) {
			for (GoldenMarimo m : super.createGoldenMarimo()) {
				marimos.add(m);
			}
		}
		return marimos;
	}
	
	public void setLoop(int loop) {
		this.loop = loop;
	}
}
