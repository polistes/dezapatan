package secondseason.observer.polistes;

import secondseason.observer.polistes.Marimo.STATE;

public class CallingAquarium implements オブザーバたん{

	public void notify(Marimo marimo, STATE state) {
		System.out.println("call : " + marimo.getName());
	}
	
}
