package imaginationfarm.story.girlToPig;

import imaginationfarm.spirit.activity.girlToPig.Caretaker;
import imaginationfarm.spirit.activity.girlToPig.GirlState;
import imaginationfarm.spirit.activity.girlToPig.stateCategory;

public class GirlTurnToPig {
    public static void girlTurnToPig() {
        //init an originator
        GirlState g = GirlState.getGirlState();

        //init a caretaker and a momento
        Caretaker c = new Caretaker();
        c.setMomento(g.createMomento());

        //change state
        System.out.println("The farmer is coming back and the girl hurries to turn to pig.");
        g.setState(stateCategory.Pig);
        g.showGirlState();

        //resume
        System.out.println("The farmer takes the umbrella he left and gets out again. And the pig is ready to resume to the previous girl ");
        g.resumeMomento(c.getMomento());
        g.showGirlState();

    }
}
