package imaginationfarm.story.action;

import imaginationfarm.abst.logger.Logger;
import imaginationfarm.spirit.creature.animal.chineseZodiac.*;

public class KillAction implements Action {
    private ChineseZodiac aim;
    KillAction(ChineseZodiac aim) {
        this.aim = aim;
    }
    public void excute(ChineseZodiac src) {
        aim.die();
        Logger.i(aim.getClass().getName() + " is killed.");
    }
}