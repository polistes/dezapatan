package iteratorPaTan.polistes.throwException;

import iteratorPaTan.polistes.concreateClasses.Aquarium;
import iteratorPaTan.polistes.concreateClasses.Marimo;
import iteratorPaTan.polistes.interfaces.IteratorTan;

public class ReturnNullAquarium extends Aquarium {

	public ReturnNullAquarium(int maxSize) {
		super(maxSize);
	}

	@Override
	public IteratorTan<Marimo> getIterator() {
		return new ReturnNullIterator(this);
	}
}
