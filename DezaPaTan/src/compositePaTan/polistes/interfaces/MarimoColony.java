package compositePaTan.polistes.interfaces;

public interface MarimoColony {
	public abstract String getName();
	public abstract int getSize();
	public abstract void add(MarimoColony mc);
	public abstract String printList(String prefix);
}
