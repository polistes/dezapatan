package templateMethodPaTan.isseium;

public class DBSaver extends AbstractSaver {

	@Override
	protected void doOpen() {
		System.out.println("Open DB");
	}

	@Override
	protected void doWrite(String str) {
		System.out.println("Write (" + str + ")");
	}

	@Override
	protected void doClose() {
		System.out.println("Close DB");
	}

	@Override
	protected void doBackup() {
		// No backup
	}

	@Override
	protected Boolean isFile() {
		return false;
	}

}
