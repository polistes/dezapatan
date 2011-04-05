package absFactoryPaTan.isseium;

public class RedPartsFactory implements  CarPartsFactory{
	public Engine createEngine(){
		return new NormalEngine();
	}
	
	public Brake createBrake(){
		return new NormalBrake();
	}
}
