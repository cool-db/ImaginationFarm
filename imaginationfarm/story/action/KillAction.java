package imaginationfarm.story.action;

import imaginationfarm.spirit.creature.animal.chineseZodiac.*;

public class KillAction implements Action {
    private ChineseZodiac aim;
    KillAction(ChineseZodiac aim) {
        this.aim = aim;
    }
    public void excute(ChineseZodiac src) {
        aim.die();
        System.out.println(aim.getClass().getName() + " is killed.");
    }
}