package imaginationfarm.abst.logger.logFilter;

import imaginationfarm.abst.logger.LogInfo;

import java.util.ArrayList;
import java.util.List;

public class ErrorLogFilter implements LogFilter {
    @Override
    public List<LogInfo> meetLogFilter(List<LogInfo> logInfos) {
        List<LogInfo> newlogInfos = new ArrayList<LogInfo>();
        for (LogInfo logInfo : logInfos) {
            if (logInfo.priority == 6) {
                newlogInfos.add(logInfo);
            }
        }
        return newlogInfos;
    }
}
