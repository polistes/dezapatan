package compositePaTan.polistes.concreates;

import compositePaTan.polistes.interfaces.MarimoColony;

public class Marimo extends MarimoColony{
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
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void add(MarimoColony mc) {
		throw new ArrayIndexOutOfBoundsException();
	}

	@Override
	public String printList(String prefix) {
		// TODO Auto-generated method stub
		return "m\t" + prefix + "/" + name + "\t" + size;
	}
	
	@Override
	public String toString() {
		System.out.println("marimo\t" + name + "\t" + size);
		return super.toString();
	}
}
