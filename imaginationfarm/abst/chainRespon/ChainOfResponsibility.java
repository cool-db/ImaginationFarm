package imaginationfarm.abst.chainRespon;

import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;

import java.util.ArrayList;

/**
 * Created by xueyingchen on 2017/10/30.
 */
public class ChainOfResponsibility {
    private ArrayList<ChineseZodiac> nextNotifier;
    private ChineseZodiac source;

    public ChainOfResponsibility(ChineseZodiac cz) {
        nextNotifier = new ArrayList<>();
        source = cz;
    }

    // 责任链模式

    public void addNextNotifier(ChineseZodiac item) {
        nextNotifier.add(item);
    }

    public void removeNextNotifier(ChineseZodiac item) {
        nextNotifier.remove(item);
    }

    public void clearNextNotifier() {
        nextNotifier.clear();
    }

    public void notify(String notification) {
        if (!source.getState().isAwake()) return;
        // Notify My Next Notifier
        if (!nextNotifier.isEmpty()) {
            for (ChineseZodiac notifier : nextNotifier) {
                notifier.getCr().notified(notification, source);
            }
        }
    }

    public void notified(String notification, ChineseZodiac from) {
        if (!source.getState().isAwake()) return;
        System.out.println(source.getClass().getSimpleName() + " get notification from " +
                from.getClass().getSimpleName() + ": " + notification);
        notify(notification);
    }

}