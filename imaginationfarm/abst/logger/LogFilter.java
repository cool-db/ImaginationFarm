package imaginationfarm.abst.logger;

import java.util.List;

public interface LogFilter {
    public List<LogInfo> meetLogFilter(List<LogInfo> logInfos);
}
