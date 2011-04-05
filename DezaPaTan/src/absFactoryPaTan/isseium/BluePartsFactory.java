package absFactoryPaTan.isseium;

public class BluePartsFactory implements  CarPartsFactory{
	public Engine createEngine(){
		return new RocketEngine();
	}
	
	public Brake createBrake(){
		return new NormalBrake();
	}
}
