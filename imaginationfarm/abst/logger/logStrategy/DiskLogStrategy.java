package imaginationfarm.abst.logger.logStrategy;

import imaginationfarm.abst.logger.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class DiskLogStrategy implements LogStrategy {

    @Override
    public void log(int priority, String tag, String message) {
        try {
            FileWriter fw = new FileWriter("./log.txt", true);
            fw.write(Logger.getLogLevel(priority) + tag + message + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}