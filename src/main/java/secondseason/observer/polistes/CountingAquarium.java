package secondseason.observer.polistes;

import secondseason.observer.polistes.Marimo.STATE;

public class CountingAquarium implements オブザーバたん{
	int count;
	
	public CountingAquarium() {
		count = 0;
	}
	
	public void notify(Marimo marimo, STATE state) {
		System.out.println("count : " + ++count);
	}
	
}
