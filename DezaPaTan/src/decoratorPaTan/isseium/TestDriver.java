package decoratorPaTan.isseium;

public class TestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �A�u���ɂ�ɂ����傤��
		AbstractRamen aburaNinnikuSyoyu = new Ninniku( new Abura (new ShoyuRamen()));
		System.out.println("�A�u���ɂ�ɂ����傤��: " + aburaNinnikuSyoyu.getCost());
		
		// ��؃}�V�}�V��
		AbstractRamen yasaiMashiMashiShio = new Yasai( new Yasai ( new ShioRamen()));
		System.out.println("��؃}�V�}�V��: " + yasaiMashiMashiShio.getCost());
	}

}
