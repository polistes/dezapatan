package absFactoryPaTan.isseium;

public class RedPartsFactory extends  CarPartsFactory{
	public Engine createEngine(){
		return new NormalEngine();
	}
	
	public Brake createBrake(){
		return new NormalBrake();
	}
}
