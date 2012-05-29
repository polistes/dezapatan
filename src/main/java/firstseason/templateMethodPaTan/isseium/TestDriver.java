package templateMethodPaTan.isseium;

public class TestDriver {
	public static void main(String[] args) {
		DBSaver dbs = new DBSaver();
		dbs.saveString("db!!!!");
		
		FileSaver filesvr = new FileSaver();
		filesvr.saveString("File!!!");
	}

}
