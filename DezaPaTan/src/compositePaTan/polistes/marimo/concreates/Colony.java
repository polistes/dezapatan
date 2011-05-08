package compositePaTan.polistes.marimo.concreates;

import java.util.ArrayList;

import compositePaTan.polistes.marimo.interfaces.MarimoColony;

public class Colony extends MarimoColony{
	private ArrayList<MarimoColony> mclist;

	public Colony(String name) {
		super(name);
		this.mclist = new ArrayList<MarimoColony>();
	}

	public int getSize() {
		int sum = 0;
		for(MarimoColony mc : mclist){
			sum += mc.getSize();
		}
		return sum;
	}

	public void add(MarimoColony mc) {
		mclist.add(mc);
	}

	public String dispComponent(String prefix) {
		StringBuffer sb = new StringBuffer();
		sb.append(prefix);
		sb.append(selfInformation());
		sb.append("\n");

		prefix = prefix.concat("  |-- ");

		for(MarimoColony mc : mclist){
			sb.append(mc.dispComponent(prefix));
			sb.append("\n");
		}

		// remove last return
		sb.delete(sb.length()-1, sb.length());

		return sb.toString();
	}


	@Override
	public String selfInformation() {
		StringBuffer sb = new StringBuffer();
		sb.append("【c】");
		sb.append(MarimoColony.delim);
		sb.append(getName());
		sb.append(" (");
		sb.append(getSize());
		sb.append(")");
		return sb.toString();
	}

}
