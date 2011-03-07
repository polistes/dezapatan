package compositePaTan.polistes.concreates;

import compositePaTan.polistes.interfaces.MarimoColony;

public class Marimo implements MarimoColony{
	private String name;
	private int size;
	
	public Marimo(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public void grow(){
		size += 10;
		if(size > 50){
			System.out.println("Oops! " + name + " has broken.");
		}
	}
	
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public void add(MarimoColony mc) {
		throw new ArrayIndexOutOfBoundsException();
	}

	public String printList(String prefix) {
		return "m\t" + prefix + "/" + name + "\t" + size;
	}
	
	@Override
	public String toString() {
		System.out.println("marimo\t" + name + "\t" + size);
		return super.toString();
	}
}
