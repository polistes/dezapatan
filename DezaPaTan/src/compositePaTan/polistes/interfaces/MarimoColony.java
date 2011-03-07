package compositePaTan.polistes.interfaces;

public abstract class MarimoColony {
	public abstract String getName();
	public abstract int getSize();
	public abstract void add(MarimoColony mc);
	public abstract String printList(String prefix);
}
