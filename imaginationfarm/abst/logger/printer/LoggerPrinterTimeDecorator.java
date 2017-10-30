package imaginationfarm.abst.logger.printer;

import imaginationfarm.abst.logger.logAdapter.LogAdapter;

import java.util.Date;

public class LoggerPrinterTimeDecorator implements Printer {
    private LoggerPrinter loggerPrinter = new LoggerPrinter();

    @Override
    public Printer t(String tag) {
        return loggerPrinter.t(tag);
    }

    @Override
    public void d(String message, Object... args) {
        loggerPrinter.d(new Date() + ":\t" + message, args);
    }

    @Override
    public void d(Object object) {
        loggerPrinter.d((new Date()).toString() + ":\t" + object);
    }

    @Override
    public void e(String message, Object... args) {
        loggerPrinter.e(new Date() + ":\t" + message, args);
    }

    @Override
    public void e(Throwable throwable, String message, Object... args) {
        loggerPrinter.e(throwable, new Date() + ":\t" + message, args);
    }

    @Override
    public void w(String message, Object... args) {
        loggerPrinter.w(new Date() + ":\t" + message, args);
    }

    @Override
    public void i(String message, Object... args) {
        loggerPrinter.i(new Date() + ":\t" + message, args);
    }

    @Override
    public void v(String message, Object... args) {
        loggerPrinter.v(new Date() + ":\t" + message, args);
    }

    @Override
    public void wtf(String message, Object... args) {
        loggerPrinter.wtf(new Date() + ":\t" + message, args);
    }

    @Override
    public void json(String json) {
        loggerPrinter.json(json);

    }

    @Override
    public void xml(String xml) {
        loggerPrinter.xml(xml);
    }

    @Override
    public synchronized void log(int priority, String tag, String message, Throwable throwable) {
        loggerPrinter.log(priority, tag, new Date() + ":\t" + message, throwable);
    }

    @Override
    public void clearLogAdapters() {
        loggerPrinter.clearLogAdapters();
    }

    @Override
    public void addAdapter(LogAdapter adapter) {
        loggerPrinter.addAdapter(adapter);
    }
}
