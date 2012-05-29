package iteratorPaTan.polistes.concreateClasses;

/**
 * 貯める物。なんでも良かったのでマリモにした。
 * 各メソッドに特に意味はない。
 **/
public class Marimo {
	private String name;
	private int r;

	public Marimo(String name, int startR){
		this.name = name;
		this.r = startR;
	}

	public int grow(){
		if(++r > 10){
			System.out.println("Oops! " + name + " has broken!");
			r /= 2;
		}
		return r;
	}

	public String getRecord(){
		return "your " + name + " has grown " + r + " cm!";
	}
}
