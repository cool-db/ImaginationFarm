package imaginationfarm.abst.logger.formatStrategy;

import imaginationfarm.abst.logger.FormatStrategy;

public class FormatStrategyMaker {
    public static FormatStrategy getCommonFormatStrategy() {
        return new CommonFormatStrategy();
    }

    public static FormatStrategy getPrettyFormatStrategy() {
        return PrettyFormatStrategy.newBuilder().build();
    }
}
