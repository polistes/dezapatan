package prototypePaTan.isseium;

public class client {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		// パターン適用前(レガシーら～めん）
		System.out.println("---- レガシーら～めん ----");
		Ramen legacy_ramen1 = new Ramen();
		legacy_ramen1.setSoup(new Soup());
		legacy_ramen1.setMen("かため");
		legacy_ramen1.setMiso();	/* 味噌 */
		
		Ramen legacy_ramen2 = new Ramen();
		legacy_ramen2.setSoup(new Soup());
		legacy_ramen2.setMen("かため");
		legacy_ramen2.setShio();	/* 塩 */
		
		legacy_ramen1.printRamen();
		legacy_ramen2.printRamen();
		
		// パターン適用後（シャローコピー）
		System.out.println("---- ら～めん錬麺術(見習い） ----");
		try {
			Ramen shallow_ramen1 = new Ramen();
			shallow_ramen1.setSoup(new Soup());
			shallow_ramen1.setMen("かため");
			shallow_ramen1.setMiso();	/* 味噌 */
			
			/* コピーして、塩とする */
			Ramen shallow_ramen2 = (Ramen) shallow_ramen1.clone();
			shallow_ramen2.setShio();	/* 塩 */
			
			shallow_ramen1.printRamen();
			shallow_ramen2.printRamen();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		// パターン適用後（ディープコピー）
		System.out.println("---- ら～めん錬麺術(ベテラン) ----");
		try {
			TrueRamen shallow_ramen1 = new TrueRamen();
			shallow_ramen1.setSoup(new TrueSoup());
			shallow_ramen1.setMen("かため");
			shallow_ramen1.setMiso();	/* 味噌 */
			
			/* コピーして、塩とする */
			TrueRamen shallow_ramen2 = (TrueRamen) shallow_ramen1.clone();
			shallow_ramen2.setShio();	/* 塩 */
			
			shallow_ramen1.printRamen();
			shallow_ramen2.printRamen();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
