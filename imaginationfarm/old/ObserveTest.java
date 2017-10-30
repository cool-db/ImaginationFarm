package imaginationfarm.old;

import imaginationfarm.abst.observe.*;
import org.testng.annotations.Test;

class Subscribe implements Observer {
    public Subscribe(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Notify:" + ((Subject) o).getData() + arg);
    }
}

class Subject extends Observable {
    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (!this.data.equals(data)) {
            this.data = data;
        }

        notify(" test");
    }
}

/**
 * Created by xueyingchen on 2017/10/29.
 */
public class ObserveTest {
    @Test
    public void test() {
        Subject sb = new Subject();
        Subscribe sc1 = new Subscribe(sb);
        Subscribe sc2 = new Subscribe(sb);
        sb.setData("observer");
    }
}
