package compositePaTan.polistes.concreates;

import compositePaTan.polistes.interfaces.MarimoColony;

public class Golden implements MarimoColony{
	private String name;
	private int size;
	
	public Golden(String name, int size) {
		this.name = "G:" + name;
		this.size = size * 10;
	}

	public String getName() {
		return name;
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

	public String printList(String prefix) {
		return "G\t" + prefix + "/【" + name + "】\t" + size;
	}
}
