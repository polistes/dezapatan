package builderPaTan.polistes;

import java.io.IOException;

public interface MarimoCreater {
	public void preprocess();
	public void createMarimo() throws IOException;
	public Marimo get();
}
