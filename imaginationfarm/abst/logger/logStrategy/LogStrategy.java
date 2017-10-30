package imaginationfarm.abst.logger.logStrategy;

public interface LogStrategy {

  void log(int priority, String tag, String message);
}
