package imaginationfarm.abst.logger.logStrategy;

public class LogStrategyMaker {
    public static LogStrategy getCommonFormatStrategy() {
        return new PrintLogStrategy();
    }

    public static LogStrategy getDiskFormatStrategy() {
        return new DiskLogStrategy();
    }
}
