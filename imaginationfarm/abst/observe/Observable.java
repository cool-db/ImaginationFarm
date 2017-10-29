package imaginationfarm.abst.observe;

import java.util.*;

/**
 * Created by xueyingchen on 2017/10/29.
 */
public class Observable {
    private ArrayList<Observer> subs;

    public Observable() {
        subs = new ArrayList<>();
    }

    public synchronized void addObserver(Observer o) throws NullPointerException {
        if (o == null) {
            throw new NullPointerException();
        }

        if (!subs.contains(o)) {
            subs.add(o);
        }
    }

    public synchronized void notifyObservers(Object arg) {
        for (Observer sub : subs) {
            sub.update(this, arg);
        }
    }
}
