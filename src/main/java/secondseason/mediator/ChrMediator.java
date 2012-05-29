package secondseason.mediator;
import java.util.ArrayList;


public abstract class ChrMediator {
	protected ArrayList<Chr> list;
	abstract public void changed(Chr c);
}
