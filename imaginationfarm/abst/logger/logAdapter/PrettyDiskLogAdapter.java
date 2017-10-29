package imaginationfarm.abst.logger.logAdapter;

import imaginationfarm.abst.logger.FormatStrategy;
import imaginationfarm.abst.logger.LogAdapter;
import imaginationfarm.abst.logger.formatStrategy.FormatStrategyMaker;
import imaginationfarm.abst.logger.formatStrategy.PrettyFormatStrategy;
import imaginationfarm.abst.logger.logStrategy.LogStrategyMaker;

public class PrettyDiskLogAdapter implements LogAdapter {
    private final FormatStrategy formatStrategy;

    public PrettyDiskLogAdapter() {
        this.formatStrategy = PrettyFormatStrategy.newBuilder().logStrategy(LogStrategyMaker.getDiskFormatStrategy()).build();
    }

    public PrettyDiskLogAdapter(FormatStrategy formatStrategy) {
        this.formatStrategy = formatStrategy;
    }

    @Override
    public boolean isLoggable(int priority, String tag) {
        return true;
    }

    @Override
    public void log(int priority, String tag, String message) {
        formatStrategy.log(priority, tag, message);
    }

}
