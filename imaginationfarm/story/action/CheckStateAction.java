package imaginationfarm.story.action;

import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;

public class CheckStateAction implements Action {
    private ChineseZodiac aim;
    private ChineseZodiac commander;

    public CheckStateAction(ChineseZodiac aim, ChineseZodiac commander) {
        this.aim = aim;
        this.commander = commander;
    }

    public void excute(ChineseZodiac src) {
        System.out.println(src.getClass().getSimpleName() + " reports to " + commander.getClass().getSimpleName() +
                " that " + aim.getClass().getSimpleName()
                + " is " + aim.getState() + ".");
    }
}