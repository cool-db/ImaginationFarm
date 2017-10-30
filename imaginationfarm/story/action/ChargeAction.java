package imaginationfarm.story.action;

import imaginationfarm.abst.logger.Logger;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;

public class ChargeAction implements Action {
    private ChineseZodiac aim;
    private String reason;
    public ChargeAction(ChineseZodiac aim, String reason) {
        this.aim = aim;
        this.reason = reason;
    }
    public void excute(ChineseZodiac src) {
        Logger.i(aim.getClass().getName() + " is charged for " + reason + ".");
    }
}