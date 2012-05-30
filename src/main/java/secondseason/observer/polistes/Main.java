package secondseason.observer.polistes;

public class Main {
	public static void main(String[] args) {
		Marimo mariannnu = new Marimo();
		mariannnu.setName("マリアンヌ");

		オブザーバたん counting = new CountingAquarium();
		mariannnu.addObserver(counting);

		オブザーバたん calling = new CallingAquarium();
		mariannnu.addObserver(calling);

		Thread mariannnuThread = new Thread(mariannnu);
		mariannnuThread.start();
	}
}