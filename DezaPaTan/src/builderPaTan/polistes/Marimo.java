package builderPaTan.polistes;

public class Marimo {
	private boolean containsNail;
	private String errorMsg;

	public Marimo(boolean error, String errorMsg) {
		this.containsNail = error;
		this.errorMsg = errorMsg;
	}

	public boolean hasError(){
		return containsNail;
	}

	public String errorMsg(){
		return errorMsg;
	}
}
