package secondseason.bridge.polistes;

public class Client {
	public static void main(String[] args) {
		BreedingTool standard = new StandardTool();
		BreedingTool goldenTool = new GoldenSpecializedTool();
		
		MarimoBreeder mb = new MarimoBreeder();
		mb.setTool(standard);
		System.out.println("normal + standard (normal) : " + mb.createNormalMarimo());
		System.out.println("normal + standard (golden) : " + mb.createGoldenMarimo());

		mb.setTool(goldenTool);
		System.out.println("----------");
		System.out.println("normal + golden (normal) : " + mb.createNormalMarimo());
		System.out.println("normal + golden (golden) : " + mb.createGoldenMarimo());
		
		MarimoBreeder goldenBreeder = new GoldenSpecializedBreeder();
		goldenBreeder.setTool(standard);
		System.out.println("----------");
		System.out.println("golden + standard (normal) : " + goldenBreeder.createNormalMarimo());
		System.out.println("golden + standard (golden) : " + goldenBreeder.createGoldenMarimo());

		goldenBreeder.setTool(goldenTool);
		System.out.println("----------");
		System.out.println("golden + golden (normal) : " + goldenBreeder.createNormalMarimo());
		System.out.println("golden + golden (golden) : " + goldenBreeder.createGoldenMarimo());
	}
}
