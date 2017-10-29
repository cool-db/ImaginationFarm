package imaginationfarm.abst.logger.logStrategy;

import imaginationfarm.abst.logger.LogStrategy;

public class LogStrategyMaker {
    public static LogStrategy getCommonFormatStrategy() {
        return new PrintLogStrategy();
    }
}
