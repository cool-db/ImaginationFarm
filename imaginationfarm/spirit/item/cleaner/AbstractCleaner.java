package imaginationfarm.spirit.item.cleaner;

public abstract class AbstractCleaner {
	public static int MEETINGROOM = 1;
	public static int PLAYGROUND = 2;
	public static int CLASSROOM = 3;

	protected int level;

	//责任链中的下一个元素
	protected AbstractCleaner nextLogger;

	public void setNextLogger(AbstractCleaner nextLogger){
		this.nextLogger = nextLogger;
    }

	public void cleanSomePlace(int level, String message){
		if(this.level <= level){
			clean(message);
		}
		else if(nextLogger !=null){
			nextLogger.cleanSomePlace(level, message);
		}
	}
	
	abstract protected void clean(String message);
}
