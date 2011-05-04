package compositePaTan.polistes.lesser;

public class Marimoryoshka {
	public static class Marimo{
		public String name;
		public int size;
		
		private Marimo next;
		
		public Marimo(String name, int size) {
			this.name = name;
			this.size = size;
		}
		
		public void setNextMarimo(Marimo next){
			this.next = next;
		}
		
		public Marimo getNextMarimo(){
			return next;
		}
		
		public void grow(){
			// 略
		}
	}
	
	public static void main(String[] args) {
		Marimo marina = new Marimo("Marina", 10);
		Marimo mariko = new Marimo("Mariko", 20);
		Marimo mariannu = new Marimo("Mariannu", 50);
		
		mariannu.setNextMarimo(mariko);
		mariko.setNextMarimo(marina);
		
		
		Marimo mari = mariannu;
		String depthStr = "";
		do{
			System.out.println(depthStr + mari.name);
			depthStr += "-";
		}while((mari = mari.getNextMarimo()) != null);
	}
}
