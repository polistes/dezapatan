package secondseason.mediator.ina;

public class MyChr extends Chr {
	public MyChr(int x, int y){
		super(x, y);
	}
	public void run(){
		moveX();
		moveY();
	}
}
