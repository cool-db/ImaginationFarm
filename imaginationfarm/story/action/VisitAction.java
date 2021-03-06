package imaginationfarm.story.action;

import imaginationfarm.abst.logger.Logger;
import imaginationfarm.spirit.creature.animal.chineseZodiac.ChineseZodiac;
import imaginationfarm.spirit.place.FarmPart;
import imaginationfarm.spirit.place.FarmVisitor;

public class VisitAction implements Action {
    private FarmPart place;
    private String reason = "";

    public VisitAction(FarmPart place) {
        this.place = place;
    }

    public VisitAction(FarmPart place, String reason) {
        this.place = place;
        this.reason = reason;
    }

    @Override
    public void excute(ChineseZodiac src) {
        if (!reason.isEmpty())
            Logger.i(src.getClass().getSimpleName() + " is requested to " + reason + ".");
        FarmVisitor fv = new FarmVisitor();
        fv.setSubject(src.getClass().getSimpleName());
        place.accept(fv);
    }
}