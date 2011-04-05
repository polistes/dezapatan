package templateMethodPaTan.polistes.abstracts;

/**
 * 成長するマリモ。
 * sizeはprivateにしてしまったので、ここからしかアクセス出来ないぞ！
 **/
public abstract class AbstractMarimo {
	protected String name;
	protected int maxSize;
	protected int growSpeed;
	protected int base;
	
	private int size;
	
	public AbstractMarimo(String name, int base) {
		this.name = name;
		this.base = base;
		this.size = base;
		
		setMaxSize();
		
		setGrowSpeed();
	}
	
	public void grow(){
		size += growSpeed;
		System.out.println(name + " has grown to " + size + " cm!");
		if(size > maxSize){
			size /= 2;
			System.out.println("Oops! " + name + " has broken.");
		}
	}
	
	protected abstract void setMaxSize();
	protected abstract void setGrowSpeed();
}
