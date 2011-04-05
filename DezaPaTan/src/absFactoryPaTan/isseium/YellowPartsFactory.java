package absFactoryPaTan.isseium;

public class YellowPartsFactory implements  CarPartsFactory{
	public Engine createEngine(){
		return new NormalEngine();
	}
	
	public Brake createBrake(){
		return new SuperBrake();
	}
}
