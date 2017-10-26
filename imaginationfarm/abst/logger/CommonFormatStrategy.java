package imaginationfarm.abst.logger;

public class CommonFormatStrategy implements FormatStrategy {

    @Override
    public void log(int priority, String tag, String message) {
        System.out.println(message);
    }
}
