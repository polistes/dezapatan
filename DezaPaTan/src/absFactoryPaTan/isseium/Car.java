package absFactoryPaTan.isseium;

public class Car {
	private Engine engine;
	private Brake brake;
	
	public void setPartsFactory(CarPartsFactory cpfactory){
		engine = cpfactory.createEngine();
		brake = cpfactory.createBrake();
	}
	
	public void startEngine(){
		engine.startEngine();
	}
	
	public void brake(){
		brake.on();
	}
}
