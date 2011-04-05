package compositePaTan.polistes.lesser;

import java.util.ArrayList;

public class Marimoryoshka2 {
	public static class Marimo{
		public String name;
		public int size;
		
		private ArrayList<Marimo> nextGrp;
		
		public Marimo(String name, int size) {
			nextGrp = new ArrayList<Marimo>();
			this.name = name;
			this.size = size;
		}
		
		public void addNextMarimo(Marimo next){
			this.nextGrp.add(next);
		}
		
		public ArrayList<Marimo> getMarimoList(){
			return nextGrp;
		}
		
		public void grow(){
			// 略
		}
	}
	
	public static void main(String[] args) {
		Marimo marichan = new Marimo("Marichan", 5);
		Marimo marina = new Marimo("Marina", 10);
		
		Marimo mariko = new Marimo("Mariko", 20);
		Marimo marimi = new Marimo("Marimi", 15);
		
		Marimo mariannu = new Marimo("Mariannu", 50);
		mariannu.addNextMarimo(mariko);
		mariannu.addNextMarimo(marichan);
		
		mariko.addNextMarimo(marina);
		mariko.addNextMarimo(marimi);
		
		dispMarimo(mariannu, 0);
	}
	
	public static void dispMarimo(Marimo marimo, int depth){
		int i = 0;
		String depStr = "";
		while(i++ < depth) depStr += "-";
		
		System.out.println(depStr + marimo.name);
		ArrayList<Marimo> marimolist = marimo.getMarimoList();
		if(marimolist != null){
			for(Marimo mari : marimolist){
				dispMarimo(mari, depth+1);
			}
		}
	}
}
