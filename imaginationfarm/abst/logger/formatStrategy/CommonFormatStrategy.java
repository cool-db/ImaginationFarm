package imaginationfarm.abst.logger.formatStrategy;

import imaginationfarm.abst.logger.FormatStrategy;

public class CommonFormatStrategy implements FormatStrategy {

    @Override
    public void log(int priority, String tag, String message) {
        System.out.println(message);
    }
}
