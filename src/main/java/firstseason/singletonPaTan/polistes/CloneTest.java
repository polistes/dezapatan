package singletonPaTan.polistes;

/**
 * シングルトンパターンでcloneメソッドを実行したらどうなるのかのテスト。
 * 結果としてはエラー吐かれて終わった。
 */
public class CloneTest {
	// シングルトンのインスタンス
	private static CloneTest singleton;
	// 変化を見るための適当な変数
	private String name;

	// コンストラクタは隠蔽
	private CloneTest(){}

	// インスタンス取得用のパブリックメソッド
	public static CloneTest getSingletonPaTan(){
		if(CloneTest.singleton == null) singleton = new CloneTest();
		return singleton;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static void main(String[] args) {
		// スタティックメソッドを利用してインスタンスを取得
		CloneTest concreatSingletonPatan = CloneTest.getSingletonPaTan();
		concreatSingletonPatan.setName("one");
		// 変数の確認
		System.out.println(concreatSingletonPatan.getName());

		// クローン取得用の変数
		CloneTest cloneSingletonPaTan = null;

		try {
			// シングルトンのクローンを作成する。
			cloneSingletonPaTan = (CloneTest) concreatSingletonPatan.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// クローンに別名を与えて、シングルトンの挙動を観察
		// って思ったら、CloneNotSupportedExceptionを吐かれた。
		cloneSingletonPaTan.setName("clone");
		System.out.println(cloneSingletonPaTan.getName());
		System.out.println(concreatSingletonPatan.getName());
	}
}
