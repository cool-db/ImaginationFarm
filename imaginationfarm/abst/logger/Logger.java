package imaginationfarm.abst.logger;

import imaginationfarm.abst.logger.logAdapter.LogAdapter;
import imaginationfarm.abst.logger.logFilter.AssertLogFilter;
import imaginationfarm.abst.logger.printer.LoggerPrinter;
import imaginationfarm.abst.logger.printer.LoggerPrinterTimeDecorator;
import imaginationfarm.abst.logger.printer.Printer;

import java.util.ArrayList;
import java.util.List;

/**
 * But more pretty, simple and powerful
 */
public final class Logger {

    public static final int VERBOSE = 2;
    public static final int DEBUG = 3;
    public static final int INFO = 4;
    public static final int WARN = 5;
    public static final int ERROR = 6;
    public static final int ASSERT = 7;
    public static boolean isBuffer = false;

    public static boolean isVERBOSE = true;
    public static boolean isDEBUG = true;
    public static boolean isINFO = true;
    public static boolean isWARN = true;
    public static boolean isERROR = true;
    public static boolean isASSERT = true;

    public static List<LogInfo> buffer = new ArrayList<>();

    private static Printer printer = new LoggerPrinterTimeDecorator();

    private Logger() {
        //no instance
    }

    public static String getLogLevel(int priority) {
        switch (priority) {
            case 2:
                return "V/";
            case 3:
                return "D/";
            case 4:
                return "I/";
            case 5:
                return "W/";
            case 6:
                return "E/";
            case 7:
                return "A/";
        }
        return null;
    }

    public static void printer(Printer printer) {
        Logger.printer = printer;
    }

    public static void addLogAdapter(LogAdapter adapter) {
        printer.addAdapter(adapter);
    }

    public static void clearLogAdapters() {
        printer.clearLogAdapters();
    }

    public static Printer t(String tag) {
        return printer.t(tag);
    }

    public static void log(int priority, String tag, String message, Throwable throwable) {
        if (isBuffer) {
            buffer.add(new LogInfo(priority, tag, message, throwable));
        }
        printer.log(priority, tag, message, throwable);
    }

    public static void setLogType(boolean isVERBOSE, boolean isDEBUG, boolean isINFO, boolean isWARN, boolean isERROR, boolean isASSERT) {
        Logger.isVERBOSE = isVERBOSE;
        Logger.isDEBUG = isDEBUG;
        Logger.isINFO = isINFO;
        Logger.isWARN = isWARN;
        Logger.isERROR = isERROR;
        Logger.isASSERT = isASSERT;
    }

    public static void enableBuffer(boolean isBuffer) {
        Logger.isBuffer = isBuffer;
    }

    public static void sync() {
        if (!isVERBOSE)
            buffer = (new AssertLogFilter()).meetLogFilter(buffer);
        if (!isDEBUG)
            buffer = (new AssertLogFilter()).meetLogFilter(buffer);
        if (!isINFO)
            buffer = (new AssertLogFilter()).meetLogFilter(buffer);
        if (!isWARN)
            buffer = (new AssertLogFilter()).meetLogFilter(buffer);
        if (!isERROR)
            buffer = (new AssertLogFilter()).meetLogFilter(buffer);
        if (!isASSERT)
            buffer = (new AssertLogFilter()).meetLogFilter(buffer);
        for (LogInfo info :
                buffer) {
            printer.log(info.priority, info.tag, info.message, info.throwable);
            buffer.remove(info);
        }
    }

    public static void d(String message, Object... args) {
        printer.d(message, args);
    }

    public static void d(Object object) {
        printer.d(object);
    }

    public static void e(String message, Object... args) {
        printer.e(null, message, args);
    }

    public static void e(Throwable throwable, String message, Object... args) {
        printer.e(throwable, message, args);
    }

    public static void i(String message, Object... args) {
        printer.i(message, args);
    }

    public static void v(String message, Object... args) {
        printer.v(message, args);
    }

    public static void w(String message, Object... args) {
        printer.w(message, args);
    }

    public static void wtf(String message, Object... args) {
        printer.wtf(message, args);
    }

    public static void json(String json) {
        printer.json(json);
    }

    public static void xml(String xml) {
        printer.xml(xml);
    }

}
