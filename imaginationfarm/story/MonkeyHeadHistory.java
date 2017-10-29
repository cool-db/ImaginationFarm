package imaginationfarm.story;
import imaginationfarm.spirit.momentoHairSpirit.MonkeyHead;
import imaginationfarm.spirit.momentoHairSpirit.cleverHair;

public class MonkeyHeadHistory {
    public void history(){
        System.out.println("------------------------------------------------------");
        MonkeyHead originator = new MonkeyHead();
        cleverHair c = new cleverHair();
        originator.setState("Bold");
        c.usePilatory(originator.saveHairState());
        System.out.println("------------------------------------------------------");

        originator.setState("NotSoBold");
        c.usePilatory(originator.saveHairState());

        System.out.println("------------------------------------------------------");

        originator.setState("DenseHair");
        c.usePilatory(originator.saveHairState());
        originator.recoverHairState(c.get(2));
        System.out.println("------------------------------------------------------");

        System.out.println("---------------The History of Monkey's Head-----------");
        originator.recoverHairState(c.get(0));
        originator.recoverHairState(c.get(1));
        originator.recoverHairState(c.get(2));
    }

    public static void main(String[] args){
        MonkeyHeadHistory m = new MonkeyHeadHistory();
        m.history();
    }

}
