package templateMethodPaTan.isseium;

public abstract class AbstractSaver {
	public void saveString(String str){
		doOpen();
		
		doWrite(str);
		
		doClose();
		
		if(isFile()){
			doBackup();
		}
	}
	
	protected abstract void doOpen();
	protected abstract void doWrite(String str);
	protected abstract void doClose();
	protected abstract void doBackup();
	protected abstract Boolean isFile();
	
}
