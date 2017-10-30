package imaginationfarm.abst.logger.formatStrategy;

public class FormatStrategyMaker {
    public static FormatStrategy getCommonFormatStrategy() {
        return new CommonFormatStrategy();
    }

    public static FormatStrategy getPrettyFormatStrategy() {
        return PrettyFormatStrategy.newBuilder().build();
    }
}
