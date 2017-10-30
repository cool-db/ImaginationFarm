package imaginationfarm.spirit.charactor;

import imaginationfarm.abst.mediator.Colleague;
import imaginationfarm.abst.mediator.Mediator;

/**
 * Created by xueyingchen on 2017/10/30.
 */
public class SuColleague extends Colleague {
    public SuColleague(Mediator m) {
        super(m);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("SuperVisor get the message: " + message);
    }
}
