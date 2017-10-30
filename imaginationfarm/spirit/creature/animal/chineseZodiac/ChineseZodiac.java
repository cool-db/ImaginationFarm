package imaginationfarm.spirit.creature.animal.chineseZodiac;

import imaginationfarm.abst.observe.Observable;
import imaginationfarm.story.action.*;
import imaginationfarm.spirit.creature.animal.Animal;
import imaginationfarm.abst.chainRespon.ChainOfResponsibility;
import imaginationfarm.abst.observe.Observer;

import java.util.ArrayList;
import java.util.List;

public class ChineseZodiac extends Animal implements Observer {
    private List<ChineseZodiac> subordinates;

    private ChainOfResponsibility cr = new ChainOfResponsibility(this);
    private ArrayList<Action> actionList = new ArrayList<>();

    // 组合模式
    public ChineseZodiac() {
        subordinates = new ArrayList<>();
    }

    public void addSubordinates(ChineseZodiac e) {
        subordinates.add(e);
    }

    public void removeSubordinates(ChineseZodiac e) {
        subordinates.remove(e);
    }

    public List<ChineseZodiac> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("ChineseZodiac : Name : " + this.getClass().getSimpleName());
    }

    public ChainOfResponsibility getCr() {
        return cr;
    }

    // 命令模式
    public void takeOrder(Action order) {
        if (!getState().isAwake()) return;
        actionList.add(order);
    }

    public void placeOrders() {
        if (!getState().isAwake()) return;
        for (Action order : actionList) {
            order.excute(this);
        }
        actionList.clear();
    }

    public void reactToState() {
        System.out.println("Find the hair is stolen.");
    }

    public void update(Observable ob, Object args) {
        if (args instanceof Action) {
            takeOrder((Action) args);
            placeOrders();
        } else {
            System.out.println(this.getClass().getSimpleName() + " get the message: " + args);
        }
    }

}
