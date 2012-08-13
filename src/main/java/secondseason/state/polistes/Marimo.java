package secondseason.state.polistes;

/**
 * マリモの体を成す空クラス。
 */
public class Marimo {
	MarimoStatus status;

	public Marimo() {
		this.status = new EnergeticMarimo();
	}

	public void setState(MarimoStatus status) { 
		this.status = status; 
	}

	public void grow() {
		while (true) {
			status.showSurfaceColor(this);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { break; }
		}
	}
}
