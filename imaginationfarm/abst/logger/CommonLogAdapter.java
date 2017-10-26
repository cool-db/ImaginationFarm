package imaginationfarm.abst.logger;

public class CommonLogAdapter implements LogAdapter {

    private final FormatStrategy formatStrategy;

    public CommonLogAdapter() {
        this.formatStrategy = PrettyFormatStrategy.newBuilder().build();
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