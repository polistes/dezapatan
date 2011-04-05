package compositePaTan.polistes.domino;

import java.util.ArrayList;
import java.util.List;

public class PargeDomino extends DominoInterface {
	private List<DominoInterface> nexts = new ArrayList<DominoInterface>();
	public void pushNext() {
		if(!isStanding()) return;
		down();
		standing = true;

		if(nexts.size() == 0) return;
		for(DominoInterface next : nexts){
			next.pushNext();
		}
	}

	public void addNext(DominoInterface domino) {
		nexts.add(domino);
	}
	public void down() {
		System.out.println("parge!");
	}

}
