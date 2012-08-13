package secondseason.state.polistes;

public class UsualMarimo implements MarimoStatus {

	int i = 0;
	public void showSurfaceColor(Marimo marimo) {
		System.out.println("green");
		if (i++ > 3) {
			marimo.setState(new DyingMarimo());
		}
	}
}
