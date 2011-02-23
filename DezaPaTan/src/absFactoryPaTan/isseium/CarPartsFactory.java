package absFactoryPaTan.isseium;

/*
 * interface から abstract に変更
 * NormalEngine, NormalBrake をデフォルトで実装
 * パーツファクトリを生成する
 */
public abstract class CarPartsFactory {
	public static final int RED = 1;
	public static final int BLUE = 2;
	public static final int YELLOW = 4;
	
	public Engine createEngine(){
		return new NormalEngine();	
	}
	
	public Brake createBrake(){
		return new NormalBrake();
	}
	
	// 追加
	// ファクトリメソッド
	// オーバライドは禁止
	public static final CarPartsFactory createFactory(int type){
		CarPartsFactory retPf = null;
		
		switch(type){
		case RED:
			retPf = new RedPartsFactory();
			break;
		case BLUE:
			retPf = new BluePartsFactory();
			break;
		case YELLOW:
			retPf = new YellowPartsFactory();
			break;
		}
		
		return retPf;
	}
}
