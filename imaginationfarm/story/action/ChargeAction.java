package imaginationfarm.story.action;

import imaginationfarm.spirit.creature.animal.chineseZodiac.*;

public class ChargeAction implements Action {
    private ChineseZodiac aim;
    private String reason;
    public ChargeAction(ChineseZodiac aim, String reason) {
        this.aim = aim;
        this.reason = reason;
    }
    public void excute(ChineseZodiac src) {
        System.out.println(aim.getClass().getName() + " is charged for " + reason + ".");
    }
}