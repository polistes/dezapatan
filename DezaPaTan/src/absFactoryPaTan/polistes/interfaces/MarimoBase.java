package absFactoryPaTan.polistes.interfaces;

public abstract class MarimoBase {
	protected String material;
	protected double softness;
	public abstract String getMaterialName();
	public abstract double getSoftness();
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.material);
		sb.append("(");
		sb.append(String.valueOf(this.softness));
		sb.append(" ms)");
		return sb.toString();
	}
}
