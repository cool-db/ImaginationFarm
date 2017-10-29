package imaginationfarm.story.action;

import imaginationfarm.spirit.creature.animal.chineseZodiac.*;

public class ChargeAction implements Action {
    private ChineseZodiac aim;
    private String reason;
    ChargeAction(ChineseZodiac aim, String reason) {
        this.aim = aim;
        this.reason = reason;
    }
    public excute() {
        System.out.println(aim.getClass().getName() + " is charged for " + reason + ".");
    }
}