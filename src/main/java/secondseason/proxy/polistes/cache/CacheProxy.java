package secondseason.proxy.polistes.cache;

import java.util.HashMap;
import java.util.Map;

import secondseason.proxy.polistes.concept.Marimo;

public class CacheProxy {
	public interface Creater {
		public Marimo createMarimo(String name);
	}

	public static class CacheCreater implements Creater {
		private Map<String, Marimo> cache = new HashMap<String, Marimo>();
		private RealCreater rc;

		public Marimo createMarimo(String name) {
			if (cache.containsKey(name)) {
				System.out.println("find in cache : " + name);
				return cache.get(name);
			} else {
				if (rc == null) rc = new RealCreater();
				Marimo marimo = rc.createMarimo(name);
				cache.put(name, marimo);
				return marimo;
			}
		}
	}

	public static class RealCreater implements Creater {
		public Marimo createMarimo(String name) {
			System.out.println("create marimo : " + name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) { }
			return new Marimo(name);
		}
	}

	public static void main(String[] args) {
		Creater creater = new CacheCreater();
		creater.createMarimo("マリアンヌ");
		creater.createMarimo("マリ太");
		creater.createMarimo("マリアンヌ");
		creater.createMarimo("マリアンヌ");
	}
}
