package imaginationfarm.abst.logger.logFilter;

import imaginationfarm.abst.logger.LogInfo;

import java.util.List;

public interface LogFilter {
    public List<LogInfo> meetLogFilter(List<LogInfo> logInfos);
}
