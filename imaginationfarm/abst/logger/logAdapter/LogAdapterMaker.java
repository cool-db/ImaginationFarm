package imaginationfarm.abst.logger.logAdapter;

import imaginationfarm.abst.logger.LogAdapter;

public class LogAdapterMaker {
    public static LogAdapter getCommonLogAdapter() {
        return new CommonLogAdapter();
    }

    public static LogAdapter getPrettyDiskLogAdapter() {
        return new PrettyDiskLogAdapter();
    }
}