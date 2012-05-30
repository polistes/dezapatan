package secondseason.composite.polistes;

public class Marimo implements コンポジットたん {
	private String name;

	public Marimo(String name) {
		this.name = name;
	}

	public void ls(int depth) {
		for (int i = 0 ; i < depth ; i++)
			System.out.print("  ");
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Marimo : " + name;
	}

	public Iterator iterator() {
		return new Iterator() {
			private boolean firstCall = true;
			public boolean hasNext() {
				return firstCall;
			}

			public コンポジットたん next() {
				firstCall = false;
				return Marimo.this;
			}
		};
	}
}
