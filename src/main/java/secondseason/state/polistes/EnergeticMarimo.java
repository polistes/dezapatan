package secondseason.state.polistes;

public class EnergeticMarimo implements MarimoStatus{
	public void showSurfaceColor(Marimo marimo) {
		System.out.println("fresh green");
		marimo.setState(new UsualMarimo());
	}
}
