package imaginationfarm.spirit.charactor;

import java.util.ArrayList;
import java.util.List;

import imaginationfarm.spirit.creature.animal.*;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;


public class Hair {

    private boolean isStolen = false;

    private final static Hair hair = new Hair();

    private Hair(){
        observers = new ArrayList<ChineseZodiac>();
    }

    private List<ChineseZodiac> observers;

    public void stolenNotify(){
        for(int i = 0; i < observers.size(); i++) {
            observers.get(i).reactToState();
        }
    }

    public void updateState(){
        isStolen = isStolen?false:true;
    }

    public void attachObserver(ChineseZodiac aninmal){
        observers.add(aninmal);
    }

    public boolean removeObserver(ChineseZodiac animal){
        return observers.remove(animal);
    }

    public static Hair getInstance(){
        return hair;
    }
}