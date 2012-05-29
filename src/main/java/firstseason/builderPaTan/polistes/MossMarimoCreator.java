package builderPaTan.polistes;

import java.io.IOException;

public class MossMarimoCreator implements MarimoCreater{
	private Marimo marimo;
	private Moss moss;

	public MossMarimoCreator(Moss moss){
		this.moss = moss;
	}

	public void preprocess() {
		moss.ballUp();
	}

	public Marimo get() {
		return marimo;
	}

	public void createMarimo() throws IOException {
		marimo = moss.getMarimo();
		if(marimo.hasError()){
			throw new IOException(marimo.errorMsg());
		}
	}
}
