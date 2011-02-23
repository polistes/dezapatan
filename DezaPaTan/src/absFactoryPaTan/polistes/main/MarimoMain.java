package absFactoryPaTan.polistes.main;

import absFactoryPaTan.polistes.greenMarimo.GreenMarimoProduct;
import absFactoryPaTan.polistes.interfaces.MarimoProduct;

public class MarimoMain {
	public static void main(String[] args) {
		MarimoProduct myMarimo;
		
		myMarimo = new GreenMarimoProduct("Marina");
		myMarimo.setMarimoBase();
		myMarimo.setMarimoCore();
		System.out.println(myMarimo);
		for(int i = 0 ; i < 10 ; i++){
			// 壊れながら最大サイズへ近づいていく
			myMarimo.grow();
		}
	}
}
