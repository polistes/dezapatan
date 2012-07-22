package secondseason.bridge.polistes;

import java.util.logging.Logger;

public class LoggingBreeder extends MarimoBreeder{
	private static Logger LOG = Logger.getLogger("marimo breeder");
	@Override
	public int createNormalMarimo() {
		LOG.info("start create Marimo : " + this.getClass());
		int numMarimo = super.createNormalMarimo();
		LOG.info("created marimo num : " + numMarimo);
		return numMarimo;
	}
	
	@Override
	public int createGoldenMarimo() {
		LOG.info("start 0create golden Marimo : " + this.getClass());
		int numMarimo = super.createGoldenMarimo();
		LOG.info("created golden marimo num : " + numMarimo);
		return numMarimo;
	}
}
