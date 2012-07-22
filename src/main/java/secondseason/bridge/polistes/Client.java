package secondseason.bridge.polistes;

public class Client {
	public static void main(String[] args) {
		BreedingTool standard = new StandardTool();
		BreedingTool goldenTool = new GoldenSpecializedTool();
		
		MarimoBreeder mb = new MarimoBreeder();
		mb.setTool(standard);
		System.out.println("normal marimo by standard tool : " + mb.createNormalMarimo());
		System.out.println("golden marimo by standard tool : " + mb.createGoldenMarimo());

		mb.setTool(goldenTool);
		System.out.println("----------");
		System.out.println("normal marimo by golden tool : " + mb.createNormalMarimo());
		System.out.println("golden marimo by golden tool : " + mb.createGoldenMarimo());

		System.out.println("----------");
		BulkBreeder bb = new BulkBreeder();
		bb.setLoop(10);
		bb.setTool(standard);
		System.out.println("normal marimo by standard tool : " + bb.createNormalMarimo());
		System.out.println("golden marimo by standard tool : " + bb.createGoldenMarimo());

		bb.setTool(goldenTool);
		System.out.println("----------");
		System.out.println("normal marimo by golden tool : " + bb.createNormalMarimo());
		System.out.println("golden marimo by golden tool : " + bb.createGoldenMarimo());
	}
}
