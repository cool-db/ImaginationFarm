package imaginationfarm.spirit.creature.animal.chineseZodiac;

import imaginationfarm.spirit.breed.IBreed;
import imaginationfarm.spirit.charactor.Farmer;
import imaginationfarm.story.action.*;
import imaginationfarm.spirit.creature.animal.Animal;
import imaginationfarm.abst.chainRespon.ChainOfResponsibility;

import java.util.ArrayList;

public class ChineseZodiac extends Animal{

    private ChainOfResponsibility cr = new ChainOfResponsibility(this);
    private ArrayList<Action> actionList = new ArrayList<>();

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
            order.excute();
        }
        actionList.clear();
    }

    public void reactToState() {
        System.out.println("Find the hair is stolen.");
    }

}
