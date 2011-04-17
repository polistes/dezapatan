package builderPaTan.polistes;

import java.util.Random;

public class Stone {
	private boolean crushed = false;
	private boolean isHardStone = false;

	public Stone(){
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());

		if(rand.nextInt(2) % 2 == 0){
			isHardStone = true;
		}
	}

	public void crush(){
		crushed = true;
	}

	public Marimo extractMarimo(){
		if(!crushed){
			return null;
		}
		Marimo marimo;

		marimo = new Marimo(isHardStone, isHardStone ? "remains big stone" : "no error");
		return marimo;
	}

	public boolean containsBigStone(){
		return isHardStone;
	}
}
