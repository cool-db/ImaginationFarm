package imaginationfarm.spirit.charactor;

import imaginationfarm.abst.logger.Logger;
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
        Logger.i("SuperVisor get the message: " + message);
    }
}
