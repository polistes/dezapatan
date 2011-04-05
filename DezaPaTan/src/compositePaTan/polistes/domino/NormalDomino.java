package compositePaTan.polistes.domino;

public class NormalDomino extends DominoInterface {
	DominoInterface next;
	public void pushNext() {
		if(!isStanding()) return;
		down();
		standing = false;

		if(next == null) return;
		next.pushNext();

	}
	public void addNext(DominoInterface domino) {
		if(next != null) throw new IndexOutOfBoundsException();
		next = domino;
	}
	public void down() {
		System.out.println("single");
	}


}
