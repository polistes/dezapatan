package builderPaTan.polistes;

import java.io.IOException;

public class Director {
	MarimoCreater creator;

	public Director(MarimoCreater creator){
		this.creator = creator;
	}

	public void create() throws IOException{
		// このあたりがBuilderらしいところ。

		creator.preprocess();
		creator.createMarimo();
	}
}
