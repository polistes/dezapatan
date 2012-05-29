package prototypePaTan.isseium;

public class client {

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		// �p�^�[���K�p�O(���K�V�[��`�߂�j
		System.out.println("---- ���K�V�[��`�߂� ----");
		Ramen legacy_ramen1 = new Ramen();
		legacy_ramen1.setSoup(new Soup());
		legacy_ramen1.setMen("������");
		legacy_ramen1.setMiso();	/* ���X */
		
		Ramen legacy_ramen2 = new Ramen();
		legacy_ramen2.setSoup(new Soup());
		legacy_ramen2.setMen("������");
		legacy_ramen2.setShio();	/* �� */
		
		legacy_ramen1.printRamen();
		legacy_ramen2.printRamen();
		
		// �p�^�[���K�p��i�V�����[�R�s�[�j
		System.out.println("---- ��`�߂�B�ˏp(���K���j ----");
		try {
			Ramen shallow_ramen1 = new Ramen();
			shallow_ramen1.setSoup(new Soup());
			shallow_ramen1.setMen("������");
			shallow_ramen1.setMiso();	/* ���X */
			
			/* �R�s�[���āA���Ƃ��� */
			Ramen shallow_ramen2 = (Ramen) shallow_ramen1.clone();
			shallow_ramen2.setShio();	/* �� */
			
			shallow_ramen1.printRamen();
			shallow_ramen2.printRamen();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		// �p�^�[���K�p��i�f�B�[�v�R�s�[�j
		System.out.println("---- ��`�߂�B�ˏp(�x�e����) ----");
		try {
			TrueRamen shallow_ramen1 = new TrueRamen();
			shallow_ramen1.setSoup(new TrueSoup());
			shallow_ramen1.setMen("������");
			shallow_ramen1.setMiso();	/* ���X */
			
			/* �R�s�[���āA���Ƃ��� */
			TrueRamen shallow_ramen2 = (TrueRamen) shallow_ramen1.clone();
			shallow_ramen2.setShio();	/* �� */
			
			shallow_ramen1.printRamen();
			shallow_ramen2.printRamen();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
