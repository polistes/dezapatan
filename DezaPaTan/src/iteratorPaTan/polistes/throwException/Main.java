package iteratorPaTan.polistes.throwException;

import iteratorPaTan.polistes.concreateClasses.Marimo;
import iteratorPaTan.polistes.interfaces.IteratorTan;

public class Main {
	public static void main(String[] args) {
		Marimo[] marimoSisters = new Marimo[3];
		marimoSisters[0] = new Marimo("Mariko", 4);
		marimoSisters[1] = new Marimo("Marina", 3);
		marimoSisters[2] = new Marimo("Mariannu", 50);

		IteratorTan<Marimo> iteratortan;
		Marimo nextMarimo;


		/** 範囲を超えるとnullを返すタイプのIterator **/
		ReturnNullAquarium RNAquarium = new ReturnNullAquarium(10);
		for(Marimo marimo : marimoSisters) RNAquarium.addMarimo(marimo);

		System.out.println("***** null type *****");

		iteratortan = RNAquarium.getIterator();
		while((nextMarimo = iteratortan.getNext()) != null){
			nextMarimo.grow();
			System.out.println(nextMarimo.getRecord());
		}


		/** 範囲を超えるとExceptionを投げ返すタイプのIterator **/
		ThrowExceptionAquarium TEAquarium = new ThrowExceptionAquarium(10);
		for(Marimo marimo : marimoSisters) TEAquarium.addMarimo(marimo);

		System.out.println("***** exception throw type *****");

		iteratortan = TEAquarium.getIterator();

		try{
			while(true){
				nextMarimo = iteratortan.getNext();
				nextMarimo.grow();
				System.out.println(nextMarimo.getRecord());
			}
		}catch (ArrayIndexOutOfBoundsException e){
			// Iterator終了
		}
		// ↓ あれ、これも動く…。
		/*while((nextMarimo = iteratortan.getNext()) != null){
			nextMarimo.grow();
			System.out.println(nextMarimo.getRecord());
		}*/
	}
}
