package secondseason.state.polistes;

public class DyingMarimo implements MarimoStatus {
	int i = 0;
	public void showSurfaceColor(Marimo marimo) {
		System.out.println("olive drab");
		if (i++ > 1) {
			marimo.setState(new DeadMarimo());
		}
	}
}
