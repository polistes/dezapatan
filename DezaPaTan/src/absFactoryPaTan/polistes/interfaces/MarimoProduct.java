package absFactoryPaTan.polistes.interfaces;

public abstract class MarimoProduct {
	
	// 現在のサイズはprivateなので、継承したクラスからは変更できない。
	private double size = 0;
	private String name;
	
	protected double growSpeed;
	protected double maxSize;
	
	protected MarimoCore core;
	protected MarimoBase base;
	
	
	public MarimoProduct(String name) {
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public abstract void setMarimoBase();
	public abstract void setMarimoCore();
	
	/**
	 * まりものサイズを変更できるのはこのメソッドだけなので、
	 * growSpeedとmaxSizeを具象クラスで設定してやらないといけない。
	 **/
	public void grow(){
		size += growSpeed;
		if(size > maxSize){
			size = size/2;
			System.out.println("Oops! " + name + " has broken!");
		}
		
		System.out.println(name + " has grown to " + size + "cm!");
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("【");sb.append(name);sb.append("】\n");
		sb.append("  size:");sb.append(size);sb.append("\n");
		sb.append("  core:");sb.append(core);sb.append("\n");
		sb.append("  base:");sb.append(base);
		return sb.toString();
	}
}
