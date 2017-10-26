package imaginationfarm.abst.logger;


public class PrintLogStrategy implements LogStrategy {

    @Override
    public void log(int priority, String tag, String message) {
        System.out.println(priority + tag + message);
    }

}