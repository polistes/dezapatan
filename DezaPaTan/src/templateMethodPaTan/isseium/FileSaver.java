package templateMethodPaTan.isseium;

public class FileSaver extends AbstractSaver {

	@Override
	protected void doOpen() {
		System.out.println("Open file");
	}

	@Override
	protected void doWrite(String str) {
		System.out.println("Write (" + str + ")");
	}

	@Override
	protected void doClose() {
		System.out.println("Close file");
	}

	@Override
	protected void doBackup() {
		System.out.println("Backup!");
	}

	@Override
	protected Boolean isFile() {
		return true;
	}

}
