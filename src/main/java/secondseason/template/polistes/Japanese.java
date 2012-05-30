package secondseason.template.polistes;

public class Japanese extends Person implements Hello{
	Hello hello = new HelloJP();
	
	@Override
	public void sayHello() {
		hello.sayHello();
	}
}
