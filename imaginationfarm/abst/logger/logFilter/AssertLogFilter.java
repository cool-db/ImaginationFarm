package imaginationfarm.abst.logger.logFilter;

import imaginationfarm.abst.logger.LogInfo;

import java.util.ArrayList;
import java.util.List;

public class AssertLogFilter implements LogFilter {
    @Override
    public List<LogInfo> meetLogFilter(List<LogInfo> logInfos) {
        List<LogInfo> newlogInfos = new ArrayList<LogInfo>();
        for (LogInfo logInfo : logInfos) {
            if (logInfo.priority == 7) {
                newlogInfos.add(logInfo);
            }
        }
        return newlogInfos;
    }
}
