package absFactoryPaTan.isseium;

public class TestDriver {

	/*
	 * Ç‹ÇËÇ‡ÉJÅ[Ég
	 * ver.0.1 
	 */
	public static void main(String[] args) {
		// Init
		CarPartsFactory cpfactory;
		Car car;
		
		// Red
		System.out.println("--- Red ---");
		cpfactory  = new RedPartsFactory(); // <--- RedParts
		car = new Car();
		car.setPartsFactory(cpfactory);
		
		car.startEngine();
		car.brake();
		
		// Blue
		System.out.println("--- Blue ---");
		cpfactory  = new BluePartsFactory(); // <--- BlueParts (ÇŸÇ©ÇÕïœâªÇ»Çµ
		car = new Car();
		car.setPartsFactory(cpfactory);
		
		car.startEngine();
		car.brake();
		
		// Yellow
		System.out.println("--- Yellow ---");
		cpfactory  = new YellowPartsFactory(); // <--- YellowParts (ÇŸÇ©ÇÕïœâªÇ»Çµ
		car = new Car();
		car.setPartsFactory(cpfactory);
		
		car.startEngine();
		car.brake();
	}
}
