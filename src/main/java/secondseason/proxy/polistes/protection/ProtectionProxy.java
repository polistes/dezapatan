package secondseason.proxy.polistes.protection;

import java.io.File;
import java.io.IOException;

import secondseason.proxy.polistes.concept.Marimo;

public class ProtectionProxy {
	private static final String KEY_FILE_PATH = "key.pass";
	
	public interface Creater {
		public Marimo createMarimo(String name);
	}

	public static class ProtectionCreater implements Creater {
		private RealCreater rc = new RealCreater();
		private File keyFile = new File(KEY_FILE_PATH);

		public Marimo createMarimo(String name) {
			if (keyFile.exists()) {
				return rc.createMarimo(name);
			} else {
				System.out.println("key file does not found");
				return null;
			}
		}
	}

	public static class RealCreater implements Creater {
		public Marimo createMarimo(String name) {
			System.out.println("create marimo : " + name);
			return new Marimo(name);
		}
	}

	public static void main(String[] args) {
		File keyFile = new File(KEY_FILE_PATH);
		Creater creater = new ProtectionCreater();
		
		try {
			keyFile.createNewFile();
			creater.createMarimo("マリアンヌ");
			keyFile.delete();
			creater.createMarimo("マリ太");
		} catch (IOException e) {
		}
	}
}
