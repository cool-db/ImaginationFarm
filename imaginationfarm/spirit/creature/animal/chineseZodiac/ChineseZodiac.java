package imaginationfarm.spirit.creature.animal.chineseZodiac;

import imaginationfarm.story.action.*;
import imaginationfarm.spirit.creature.animal.Animal;
import imaginationfarm.abst.chainRespon.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class ChineseZodiac extends Animal{
    private List<ChineseZodiac> subordinates;
    public ChineseZodiac(){
        subordinates = new ArrayList<ChineseZodiac>();
    }
    public void add(ChineseZodiac e) {
        subordinates.add(e);
    }
    public void remove(ChineseZodiac e) {
        subordinates.remove(e);
    }
    public List<ChineseZodiac> getSubordinates(){
        return subordinates;
    }
    public String toString(){
        return ("ChineseZodiac : Name : "+ this.getClass().getSimpleName());
    }

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
