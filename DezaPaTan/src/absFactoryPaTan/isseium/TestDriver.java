package absFactoryPaTan.isseium;

public class TestDriver {

	/*
	 * まりもカート
	 * ver.0.2 
	 * 
	 * 変更点
	 * 西島産のコードを参考に簡略化
	 * 1. 直感的に使えるようにCarPartsFactoryクラス内にファクトリメソッド(Simple Factory)を作った 
	 * 			=> final にしてるけど、子クラス（工場）が工場を作れてしまう世界になってしまうので、あるメソッドを継承から除外するって書き方できるんですか？ 
	 * 2. CarPartsFactory を interface から abstract に変更し、デフォルトのエンジンとブレーキを定義した 
	 */
	public static void main(String[] args) {
		// Init
		CarPartsFactory cpfactory;
		Car car;
		
		// Red
		System.out.println("--- Red ---");
		cpfactory  = CarPartsFactory.createFactory(CarPartsFactory.RED); // <--- RedParts
		car = new Car();
		car.setPartsFactory(cpfactory);
		car.startEngine();
		car.brake();
		
		// Blue
		System.out.println("--- Blue ---");
		cpfactory  = CarPartsFactory.createFactory(CarPartsFactory.BLUE); // <--- BlueParts (ほかは変化なし
		car = new Car();
		car.setPartsFactory(cpfactory);
		
		car.startEngine();
		car.brake();
		
		// Yellow
		System.out.println("--- Yellow ---");
		cpfactory  = CarPartsFactory.createFactory(CarPartsFactory.YELLOW); // <--- YellowParts (ほかは変化なし
		car = new Car();
		car.setPartsFactory(cpfactory);
		
		car.startEngine();
		car.brake();
	}
}
