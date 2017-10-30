package imaginationfarm.abst.logger.formatStrategy;

public interface FormatStrategy {

    void log(int priority, String tag, String message);
}
