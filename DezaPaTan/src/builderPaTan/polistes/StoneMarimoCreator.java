package builderPaTan.polistes;

import java.io.IOException;


public class StoneMarimoCreator implements MarimoCreater {
	private Stone stone;
	private Marimo marimo;

	public StoneMarimoCreator(Stone stone) {
		this.stone = stone;
	}

	public void preprocess() {
		stone.crush();
	}

	public void createMarimo() throws IOException {
		marimo = stone.extractMarimo();
		if(marimo.hasError()){
			throw new IOException(marimo.errorMsg());
		}
	}

	public Marimo get() {
		return marimo;
	}

}
