package imaginationfarm.abst.logger.logStrategy;


import imaginationfarm.abst.logger.Logger;

public class PrintLogStrategy implements LogStrategy {

    @Override
    public void log(int priority, String tag, String message) {
        System.out.println(Logger.getLogLevel(priority) + tag + message);
    }

}