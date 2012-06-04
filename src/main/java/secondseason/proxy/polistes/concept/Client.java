package secondseason.proxy.polistes.concept;

public class Client {
	public static void main(String[] args) {
		Creater creater = new NormalCreater();
		System.out.println(creater.createNormalMarimo("普通マリモ"));
		System.out.println(creater.createSuperMarimo("超マリモ"));
	}
}
