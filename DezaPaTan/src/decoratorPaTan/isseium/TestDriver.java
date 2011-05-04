package decoratorPaTan.isseium;

public class TestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// アブラにんにくしょうゆ
		AbstractRamen aburaNinnikuSyoyu = new Ninniku( new Abura (new ShoyuRamen()));
		System.out.println("アブラにんにくしょうゆ: " + aburaNinnikuSyoyu.getCost());
		
		// 野菜マシマシ塩
		AbstractRamen yasaiMashiMashiShio = new Yasai( new Yasai ( new ShioRamen()));
		System.out.println("野菜マシマシ塩: " + yasaiMashiMashiShio.getCost());
	}

}
