package imaginationfarm.abst.logger;

public class LogInfo {
    public int priority;
    String tag;
    String message;
    Throwable throwable;

    LogInfo(int priority, String tag, String message, Throwable throwable) {
        this.priority = priority;
        this.tag = tag;
        this.message = message;
        this.throwable = throwable;
    }
}