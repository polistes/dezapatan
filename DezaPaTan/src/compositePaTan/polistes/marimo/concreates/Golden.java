package compositePaTan.polistes.marimo.concreates;

import compositePaTan.polistes.marimo.interfaces.MarimoColony;

public class Golden extends MarimoColony{
	private int size;

	public Golden(String name, int size) {
		super(name);
		this.size = size * 10;
	}

	public int getSize() {
		return size;
	}

	public void add(MarimoColony mc) {
		try {
			throw new ClassNotFoundException();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String dispComponent(String prefix) {
		return prefix + selfInformation();
	}

	@Override
	public String selfInformation() {
		StringBuffer sb = new StringBuffer();
		sb.append("【G】");
		sb.append(MarimoColony.delim);
		sb.append("†");
		sb.append(getName());
		sb.append("†");
		sb.append(" (");
		sb.append(getSize());
		sb.append(")");
		return sb.toString();
	}
}
