package compositePaTan.polistes.marimo.interfaces;

public abstract class MarimoColony {
	private String name;
	public static final String delim = " ";

	public MarimoColony(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public abstract int getSize();
	public abstract void add(MarimoColony mc);

	public String dispComponent(){
		return dispComponent("");
	}

	public abstract String dispComponent(String prefix);
	public String selfInformation(){
		return this.name;
	}
}
