package imaginationfarm.spirit.item.momentoHairSpirit;

import java.util.ArrayList;
import java.util.List;

public class cleverHair {
    private List<Pilatory> headList = new ArrayList<Pilatory>();

    public void usePilatory(Pilatory s){
        System.out.println("cleverHead: usePilatory: The monkey's head will become " + s.getHairState());
        headList.add(s);
    }

    public Pilatory get(int index){
        System.out.println("cleverHead: get: The monkey's head has become " + headList.get(index).getHairState());
        return headList.get(index);
    }
}
