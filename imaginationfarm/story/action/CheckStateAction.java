package imaginationfarm.story.action;

import imaginationfarm.abst.logger.Logger;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;

public class CheckStateAction implements Action {
    private ChineseZodiac aim;
    private ChineseZodiac commander;

    public CheckStateAction(ChineseZodiac aim, ChineseZodiac commander) {
        this.aim = aim;
        this.commander = commander;
        Logger.i(commander.getClass().getSimpleName() + " requests to check whether " +
                aim.getClass().getSimpleName() + " is awake.");
    }

    public void excute(ChineseZodiac src) {
        Logger.i(src.getClass().getSimpleName() + " reports to " + commander.getClass().getSimpleName() +
                " that " + aim.getClass().getSimpleName()
                + " is " + aim.getState() + ".");
    }
}