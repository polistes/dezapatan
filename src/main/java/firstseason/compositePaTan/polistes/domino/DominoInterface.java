package compositePaTan.polistes.domino;

public abstract class DominoInterface {
	protected boolean standing = true;
	public boolean isStanding(){
		return standing;
	}
	public abstract void pushNext();
	public abstract void addNext(DominoInterface domino);
	abstract void down();
}
