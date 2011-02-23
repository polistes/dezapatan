package absFactoryPaTan.isseium;

public class YellowPartsFactory extends CarPartsFactory{
	public Engine createEngine(){
		return new NormalEngine();
	}
	
	public Brake createBrake(){
		return new SuperBrake();
	}
}
