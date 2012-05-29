package iteratorPaTan.polistes.throwException;

import iteratorPaTan.polistes.concreateClasses.Aquarium;
import iteratorPaTan.polistes.concreateClasses.Marimo;
import iteratorPaTan.polistes.interfaces.IteratorTan;

public class ThrowExceptionAquarium extends Aquarium{

	public ThrowExceptionAquarium(int maxSize) {
		super(maxSize);
	}

	@Override
	public IteratorTan<Marimo> getIterator(){
		return new ThrowExceptionIterator(this);

	}
}
