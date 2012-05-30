package secondseason.template.polistes;

public class American extends Person implements Hello{
//	Hello hello = new HelloUS();]
	Hello hello = new HelloJP();
	
	@Override
	public void sayHello() {
		hello.sayHello();
	}
	
}
