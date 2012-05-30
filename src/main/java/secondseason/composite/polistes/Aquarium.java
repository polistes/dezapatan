package secondseason.composite.polistes;

import java.util.ArrayList;
import java.util.List;

public class Aquarium implements コンポジットたん {
	private List<コンポジットたん> marimoList =
			new ArrayList<コンポジットたん>();

	public void add(コンポジットたん marimo) {
		marimoList.add(marimo);
	}

	public void ls(int depth) {
		for (int i = 0 ; i < depth ; i++)
			System.out.print("  ");
		System.out.println(this);
		for (コンポジットたん marimo : marimoList) {
			marimo.ls(depth+1);
		}
	}

	@Override
	public String toString() {
		return "Aquarium";
	}

	public Iterator iterator() {
		return new Iterator() {
			private int index = 0;
			private boolean firstCall = true;
			private Iterator イテレーたん;

			public boolean hasNext() {
				if (firstCall) return true;
				if (イテレーたん == null) {
					if(index < marimoList.size()) {
						イテレーたん = marimoList.get(index).iterator();
					} else {
						return false;
					}
				}
				if (イテレーたん.hasNext()) {
					return true;
				} else {
					イテレーたん = null;
					index++;
					return hasNext();
				}
			}

			public コンポジットたん next() {
				if (firstCall) {
					firstCall = false;
					return Aquarium.this;
				}
				return イテレーたん.next();
			}
		};
	}
}
