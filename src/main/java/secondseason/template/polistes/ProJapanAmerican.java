package secondseason.template.polistes;

public class ProJapanAmerican extends American {
	Hello hello = new HelloJP();
	
	@Override
	public void sayHello() {
		hello.sayHello();
	}
}
