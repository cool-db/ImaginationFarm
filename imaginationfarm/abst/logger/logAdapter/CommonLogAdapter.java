package imaginationfarm.abst.logger.logAdapter;

import imaginationfarm.abst.logger.formatStrategy.FormatStrategy;
import imaginationfarm.abst.logger.formatStrategy.FormatStrategyMaker;

public class CommonLogAdapter implements LogAdapter {

    private final FormatStrategy formatStrategy;

    public CommonLogAdapter() {
        this.formatStrategy = FormatStrategyMaker.getCommonFormatStrategy();
    }

    public CommonLogAdapter(FormatStrategy formatStrategy) {
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