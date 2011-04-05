package compositePaTan.polistes.concreates;

import java.util.ArrayList;

import compositePaTan.polistes.interfaces.MarimoColony;

public class Colony implements MarimoColony{
	private String name;
	private ArrayList<MarimoColony> mclist;
	
	public Colony(String name) {
		this.name = name;
		this.mclist = new ArrayList<MarimoColony>();
	}
		
	public String getName() {
		return name;
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

	public String printList(String prefix) {
		StringBuffer sb = new StringBuffer();
		sb.append("c\t");sb.append(prefix);sb.append("/");
		sb.append(name);sb.append("\t");sb.append(getSize());
		sb.append("\n");
		for(MarimoColony mc : mclist){
			sb.append(mc.printList(prefix + "/" + name));
			sb.append("\n");
		}
		sb.delete(sb.length()-1, sb.length());
		return sb.toString();
	}
	
	@Override
	public String toString() {
		String curpos = "./" + name;
		StringBuffer sb = new StringBuffer();
		sb.append(curpos);
		sb.append("\n");
		for(MarimoColony mc : mclist){
			sb.append(mc.printList(curpos));
			sb.append("\n");
		}
		return sb.toString();
	}
}
