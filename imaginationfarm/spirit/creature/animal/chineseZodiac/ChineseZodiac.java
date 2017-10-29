package imaginationfarm.spirit.creature.animal.chineseZodiac;

import imaginationfarm.spirit.creature.animal.Animal;
import imaginationfarm.abst.state.*;
import imaginationfarm.story.action.*;

import java.util.ArrayList;

public class ChineseZodiac implements Animal {

    protected ArrayList<ChineseZodiac> nextNotifier = new ArrayList<ChineseZodiac>();
    protected ArrayList<Action> actionList = new ArrayList<Action>();
    protected State state = new SleepingState();


    // 责任链模式

    public void addNextNotifier(ChineseZodiac item) {
        this.nextNotifier.add(item);
    }

    public void removeNextNotifier(ChineseZodiac item) {
        this.nextNotifier.remove(item);
    }

    public void clearNextNotifier() {
        this.nextNotifier.clear();
    }

    public void notify(String notification) {
        if (!state.isAwake()) return;

        // Get Notified
        notified(notification);

        // Notify My Next Notifier
        if (!nextNotifier.isEmpty()) {
            for (ChineseZodiac notifier : nextNotifier) {
                notifier.notify(notification);
            }
        }
    }

    public void notified(String notification) {
        if (!state.isAwake()) return;
        System.out.println("get notification: " + notification);
    }

    // 状态模式
    public boolean wakeUp() {
        if (this.state.toString() == "sleeping") {
            this.state = new AwakeState();
            return true;
        }
        return false;
    }

    public boolean die() {
        if (this.state.toString() != "dead") {
            this.state = new DeadState();
            return true;
        }
        return false;
    }

    // 命令模式
    public void takeOrder(Action order) {
        if (!state.isAwake()) return;
        actionList.add(order);
    }

    public void placeOrders() {
        if (!state.isAwake()) return;
        for (Action order : actionList) {
            order.excute();
        }
        actionList.clear();
    }

    public void reactToState() {
        System.out.println("Find the hair is stolen.");
    }

}
