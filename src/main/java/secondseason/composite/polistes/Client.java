package secondseason.composite.polistes;

public class Client {
	public static void main(String[] args) {
		Aquarium aqua1 = new Aquarium();
		Aquarium aqua2 = new Aquarium();
		
		aqua1.add(new Marimo("マリアンヌ"));
		aqua1.add(new Marimo("マリコ"));
		
		aqua2.add(new Marimo("マリモーネ"));
		aqua2.add(new Marimo("マリオ"));
		
		aqua1.add(aqua2);
		
//		aqua1.ls(0);
		Iterator イテレーたん = aqua1.iterator();
		while(イテレーたん.hasNext()) {
			System.out.println(イテレーたん.next());
		}
	}
}
