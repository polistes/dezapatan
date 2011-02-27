package absFactoryPaTan.polistes.interfaces;

public abstract class MarimoCore {
	protected String material;
	protected double hardness;
	
	public abstract String getMaterialName();
	public abstract double getHardness();
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.material);
		sb.append("(");
		sb.append(String.valueOf(this.hardness));
		sb.append(" mh)");
		return sb.toString();
	}
}
