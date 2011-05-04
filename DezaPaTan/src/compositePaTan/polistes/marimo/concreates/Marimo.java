package compositePaTan.polistes.marimo.concreates;

import compositePaTan.polistes.marimo.interfaces.MarimoColony;

public class Marimo extends MarimoColony{
	private int size;

	public Marimo(String name, int size) {
		super(name);
		this.size = size;
	}

	public void grow(){
		size += 10;
		if(size > 50){
			System.out.println("Oops! " + getName() + " has broken.");
		}
	}

	public int getSize() {
		return size;
	}

	public void add(MarimoColony mc) {
		throw new ArrayIndexOutOfBoundsException();
	}

	public String dispComponent(String prefix) {
		return  prefix + selfInformation();
	}

	@Override
	public String selfInformation() {
		StringBuffer sb = new StringBuffer();
		sb.append("【m】");
		sb.append(MarimoColony.delim);
		sb.append(getName());
		sb.append(" (");
		sb.append(getSize());
		sb.append(")");
		return sb.toString();
	}

	/*@Override
	public String toString() {
		System.out.println("marimo\t" + name + "\t" + size);
		return super.toString();
	}*/
}
